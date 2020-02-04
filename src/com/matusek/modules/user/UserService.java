package com.matusek.modules.user;

import com.matusek.modules.company.CompanyService;

public class UserService {

    public static void printUsers() {
        new CompanyService().createCompany("Team A");
    }
}
