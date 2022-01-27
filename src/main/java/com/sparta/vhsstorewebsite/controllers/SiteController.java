package com.sparta.vhsstorewebsite.controllers;

import com.sparta.vhsstorewebsite.entities.FilmEntity;
import com.sparta.vhsstorewebsite.entities.UserEntity;
import com.sparta.vhsstorewebsite.repositories.*;
import com.sparta.vhsstorewebsite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SiteController {
    private final ActorRepository actorRepository;
    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final FilmActorRepository filmActorRepository;
    private final FilmCategoryRepository filmCategoryRepository;
    private final FilmRepository filmRepository;
    private final StaffRepository staffRepository;
    private final UserRepository userRepository;
    private final UserService userService = new UserService();

    @Autowired
    public SiteController(ActorRepository actorRepository, CategoryRepository categoryRepository, CustomerRepository customerRepository, FilmActorRepository filmActorRepository, FilmCategoryRepository filmCategoryRepository, FilmRepository filmRepository, StaffRepository staffRepository, UserRepository userRepository) {
        this.actorRepository = actorRepository;
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.filmActorRepository = filmActorRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.filmRepository = filmRepository;
        this.staffRepository = staffRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("films", filmRepository.findAll());
        return "index";
    }

    @GetMapping("/about")
    public String goToAbout() {
        return "about";
    }

    @GetMapping("/login")
    public String goToLogin() {
        return "login";
    }

    @GetMapping("/search")
    public String goToSearch(Model model) {
        model.addAttribute("film", filmRepository.findAll());
        return "search";
    }

    @GetMapping("/customer-request")
    public String addCustomer(){
        return "add-customer";
    }

    @GetMapping("/reserved-vhs")
    public String goToReservedVhs(Model model) {
        model.addAttribute("films", filmRepository.findAll());
        return "reserved-vhs";
    }

    @GetMapping("/admin")
    public String goToAdmin() {
        return "admin";
    }

    @GetMapping("/show-customers")
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", getCustomers(userRepository.findAll()));
        return "show-customers";
    }

    @GetMapping("/show-vhs")
    public String getAllVhs(Model model) {
        model.addAttribute("films", filmRepository.findAll());
        return "show-vhs";
    }

    @GetMapping("/add-user")
    public String goToAddUser() {
        return "add-user";
    }

    @PostMapping("/save-user")
    public String saveUser(@ModelAttribute("user") UserEntity entity){
        userRepository.save(entity);
        return "index";
    }

    @GetMapping("/edit-user/{id}")
    public String editUser(@PathVariable("id") Integer id, Model model){
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Customer ID" + id));
        model.addAttribute("user", userEntity);
        return "edit-user";
    }

    @PostMapping("/update-user/{id}")
    public String updateUser(@ModelAttribute("user") UserEntity updatedUser, @PathVariable("id") Integer id){
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Customer ID" + id));
        userService.update(updatedUser, userEntity);
        userRepository.save(userEntity);
        return "index";
    }

    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid User ID" + id));
        userRepository.delete(userEntity);
        return "index";
    }

    @GetMapping("/add-vhs")
    public String goToAddVhs() {
        return "add-vhs";
    }

    @PostMapping("/save-vhs")
    public String saveVhs(@ModelAttribute("film") FilmEntity entity){
        filmRepository.save(entity);
        return "index";
    }

    @GetMapping("/delete-vhs/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        FilmEntity filmEntity = filmRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Film ID" + id));
        filmRepository.delete(filmEntity);
        return "index";
    }

    @GetMapping("/edit-vhs/{id}")
    public String editVhs(@PathVariable("id") Integer id, Model model){
        FilmEntity filmEntity = filmRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Film ID" + id));
        model.addAttribute("film", filmEntity);
        return "edit-vhs";
    }

    @PostMapping("/update-vhs/{id}")
    public String updateCustomer(@ModelAttribute("film") UserEntity updatedUser, @PathVariable("id") Integer id){
        FilmEntity filmEntity = filmRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Film ID" + id));
        //filmService.update(updatedUser, userEntity);
        filmRepository.save(filmEntity);
        return "index";
    }

    @GetMapping("/rented")
    public String goToRented(Model model) {
        model.addAttribute("films", filmRepository.findAll());
        return "rented";
    }

    @GetMapping("/customer-waiting-list")
    public String goToCustomerWaitingList(Model model) {
        model.addAttribute("customers", getCustomers(userRepository.findAll()));
        return "customer-waiting-list";
    }

    @GetMapping("/show-staff")
    public String goToStaff(Model model) {
        model.addAttribute("staff", getStaff(userRepository.findAll()));
        return "show-staff";
    }

    private List<UserEntity> getStaff(List<UserEntity> allUsers){
        List<UserEntity> staff = new ArrayList<>();
        for (UserEntity e: allUsers) {
            if (e.getRole().equals("STAFF")) staff.add(e);
        }
        return staff;
    }

    private List<UserEntity> getCustomers(List<UserEntity> allUsers){
        List<UserEntity> customers = new ArrayList<>();
        for (UserEntity e: allUsers) {
            if (e.getRole().equals("CUSTOMER")) customers.add(e);
        }
        return customers;
    }


}
