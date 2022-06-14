package fr.m2i.crm;

import fr.m2i.crm.helper.SessionHelper;

import javax.persistence.*;

public class Main {
    public static void main(String[] args){

       // EntityManagerFactory emf = Persistence.createEntityManagerFactory("crm2");
       // EntityManager entityManager = emf.createEntityManager();
        EntityManager entityManager = SessionHelper.getEntityManager();
        entityManager.close();







    }
}