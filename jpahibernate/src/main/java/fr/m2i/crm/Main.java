package fr.m2i.crm;

import fr.m2i.crm.dao.CustomerDao;
import fr.m2i.crm.helper.SessionHelper;
import fr.m2i.crm.model.Customer;

import javax.persistence.*;

public class Main {
    public static void main(String[] args){

        EntityManager entityManager = SessionHelper.getEntityManager();
        // some action with jpa with DAO
        CustomerDao customerDAO = new CustomerDao();
//        customerDAO.create();

        Customer customerData = new Customer();
        customerData.setZipCode("75001");

        customerDAO.update(2L, customerData);

        entityManager.close();
    }







    }
