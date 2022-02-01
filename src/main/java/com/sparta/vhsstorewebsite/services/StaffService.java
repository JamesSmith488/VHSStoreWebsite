package com.sparta.vhsstorewebsite.services;

import com.sparta.vhsstorewebsite.entities.StaffEntity;

public class StaffService {

    public void update(StaffEntity updatedStaff, StaffEntity staff) {
        staff.setFirstName(updatedStaff.getFirstName());
        staff.setLastName(updatedStaff.getLastName());
        staff.setAddressId(updatedStaff.getAddressId());
        staff.setPicture(updatedStaff.getPicture());
        staff.setEmail(updatedStaff.getEmail());
        staff.setStoreId(updatedStaff.getStoreId());
        staff.setActive(updatedStaff.getActive());
        staff.setUsername(updatedStaff.getUsername());
        staff.setPassword(updatedStaff.getPassword());
        staff.setLastUpdate(updatedStaff.getLastUpdate());
    }
}
