package com.matusek.modules.company;

public class CompanyService {

    public Company createCompany(String companyName) {
        return new Company(companyName);
    }
}
