package com.matusek.modules.device;

import com.matusek.modules.company.CompanyService;

public class DeviceService {
    public static void printDeviceInfo() {
        new CompanyService().createCompany("Test123");
    }
}
