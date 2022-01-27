package com.sparta.vhsstorewebsite.controllers;

import com.sparta.vhsstorewebsite.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
    private final ActorRepository actorRepository;
    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final FilmActorRepository filmActorRepository;
    private final FilmCategoryRepository filmCategoryRepository;
    private final FilmRepository filmRepository;
    private final StaffRepository staffRepository;

    @Autowired
    public SiteController(ActorRepository actorRepository, CategoryRepository categoryRepository, CustomerRepository customerRepository, FilmActorRepository filmActorRepository, FilmCategoryRepository filmCategoryRepository, FilmRepository filmRepository, StaffRepository staffRepository) {
        this.actorRepository = actorRepository;
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.filmActorRepository = filmActorRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.filmRepository = filmRepository;
        this.staffRepository = staffRepository;
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
        model.addAttribute("films", filmRepository.findAll());
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
        model.addAttribute("customers", customerRepository.findAll());
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

    @GetMapping("/add-vhs")
    public String goToAddVhs() {
        return "add-vhs";
    }

    @GetMapping("/rented")
    public String goToRented(Model model) {
        model.addAttribute("films", filmRepository.findAll());
        return "rented";
    }

    @GetMapping("/customer-waiting-list")
    public String goToCustomerWaitingList(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customer-waiting-list";
    }

    @GetMapping("/show-staff")
    public String goToStaff(Model model) {
        model.addAttribute("staff", staffRepository.findAll());
        return "show-staff";
    }

}
