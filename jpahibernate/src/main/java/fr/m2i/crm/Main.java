package fr.m2i.crm;

import fr.m2i.crm.dao.CustomerDao;
import fr.m2i.crm.helper.SessionHelper;
import fr.m2i.crm.model.Customer;
import fr.m2i.crm.state.CustomerState;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args){

        EntityManager entityManager = SessionHelper.getEntityManager();
        // some action with jpa with DAO
        CustomerDao customerDAO = new CustomerDao();
//        customerDAO.create();

        Customer customerData = new Customer();
        Customer newCustomer = new Customer();
        newCustomer.setAddress("1 rue de la paix");
        newCustomer.setCity("Paris");
        newCustomer.setCompanyName("Le nom de mon entreprise");
        newCustomer.setCountry("France");
        newCustomer.setCustomerState(CustomerState.INACTIVE);
        newCustomer.setEmail("new-customer@email.com");
        newCustomer.setFirstname("New");
        newCustomer.setLastname("Customer");
        newCustomer.setPhone("0612121212");
        newCustomer.setZipCode("75001");

        customerDAO.create(newCustomer);

      //  Customer otherCustomer = null;
       // Customer otherCustomer = new Customer();
       // customerDAO.create(otherCustomer);


        customerData.setCompanyName("Mon nouveau nom d'entreprise");

// Attention sur l'id qu'on envoi ici
        customerDAO.update(3L, customerData);
        List<Customer> customerList = customerDAO.findAll();

        for (Customer customer : customerList) {
            System.out.println("company_name: " + customer.getCompanyName());
        }


        entityManager.close();
    }









    }
