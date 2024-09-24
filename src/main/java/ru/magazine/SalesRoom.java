package ru.magazine;

import ru.magazine.Department.BaseDepartment;
import ru.magazine.client.BaseClient;
import ru.magazine.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<BaseDepartment> departmentList;
    private String name;
    private ArrayList<BaseClient> clientList;
    private Administrator administrator;
}
