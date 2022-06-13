package fr.m2i.crm;

import helper.SessionHelper;
import org.hibernate.Session;

import javax.persistence.*;

public class Main {
    public static void main(String[] args){

       // EntityManagerFactory emf = Persistence.createEntityManagerFactory("crm2");
       // EntityManager entityManager = emf.createEntityManager();
        EntityManager entityManager = SessionHelper.getEntityManager();








    }
}