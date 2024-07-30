package org.example;

import org.example.dao.impl.AddressDaoImpl;
import org.example.dao.impl.AgencyDaoImpl;
import org.example.dao.impl.CustomersDaoImpl;
import org.example.dao.impl.OwnerDaoImpl;
import org.example.databese.HibernateConfig;
import org.example.entity.*;
import org.example.gonger.Gonger;
import org.example.servis.impl.AddressServiceImpl;
import org.example.servis.impl.Rent_infoServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AddressDaoImpl addressDao = new AddressDaoImpl();
        AgencyDaoImpl agencyDao = new AgencyDaoImpl();
        CustomersDaoImpl customersDao = new CustomersDaoImpl();
        Rent_infoServiceImpl rentInfoService = new Rent_infoServiceImpl();
        //  addressDao.deleteById(2L);
        OwnerDaoImpl ownerDao = new OwnerDaoImpl();
        ownerDao.ownerAndHouse();

//        Rent_info rentInfo = new Rent_info("jooma",343434,"FEF","FERF");
//     Customer customer =    new Customer("joomart","ishenbaev","j@gmail.com", LocalDate.of(2024,3,3), Gonger.J,"kyrkyz",List.of(rentInfo));
//         System.out.println(customersDao.saveOrUpdate(customer));
//       System.out.println(customer);
//customersDao.getRent_iNFO("jooma");
    }}

      //  agencyDao.saveOrUpdate(new Agency("Test 1", "+996778656787", new Address("sdfsdf", "sdfd", "sdfs")));
       // addressDao.getAgencyByCity("jooma");
//        while (true) {
//            System.out.println("1: Address");
//            System.out.println("2: Agency");
//            System.out.println("3: House");
//            System.out.println("4: Owner");
//            System.out.println("5: Rent_info");
//            boolean a1 = false;
//            while (!a1) {
//                switch (new Scanner(System.in).nextInt()) {
//                    case 1:
//                        System.out.println("1: saveOrUpdate");
//                        System.out.println("2: findById");
//                        System.out.println("3:  findAll");
//                        System.out.println("4  deleteById ");
//                        System.out.println("5:  update ");
//                        System.out.println("6:  findByCity");
//                        System.out.println("7:  ВЫХОД");
//                        System.out.println("8: getAgencyAdress");
//                        System.out.println("9: getAgencyByCity");
//                        switch (new Scanner(System.in).nextInt()) {
//                            case 1:
//                                addressDao.saveOrUpdate(new Address("Москва", "Африка", "akunabaieva"));
//                                break;
//                            case 2:
//                                System.out.println(addressDao.findById(2L));
//                                break;
//                            case 3:
//                                System.out.println(addressDao.findAll());
//                                break;
//                            case 4:
//                                addressDao.deleteById(1L);
//                                break;
//                            case 5:
//                                System.out.println(addressDao.update(2L, new Address()));
//                                break;
//                            case 6:
//                                System.out.println(addressDao.findByCity("Москва"));
//                                break;
//                            case 7:
//                                a1 = true;
//                                break;
//                            case 8:
//                                addressDao.getAgencyByAdress();
//
//                        }
//                        break;
//                    case 2:
//                        while (true) {
//                            System.out.println("1: saveOrUpdate");
//                            System.out.println("2: findById");
//                            System.out.println("3:  findAll");
//                            System.out.println("4  deleteById ");
//                            System.out.println("5:  update ");
//                            System.out.println("6:   findByName");
//                            System.out.println("7:  ВЫХОД");
//                            boolean a2 = false;
//                            while (!a2) {
//                                switch (new Scanner(System.in).nextInt()) {
//                                    case 1:
//                                        System.out.println(agencyDao.saveOrUpdate(new Agency("Test 1", "+9968767564", new Address("sdfsdf", "sdfd", "sdfs"))));
//                                        break;
//                                    case 2:
//                                        System.out.println(agencyDao.findById(2L));
//                                        break;
//                                    case 3:
//                                        System.out.println(agencyDao.findAll());
//                                        break;
//                                    case 4:
//                                        agencyDao.deleteById(2L);
//                                        break;
//                                    case 5:
//                                        System.out.println(agencyDao.update(2L, new Agency()));
//                                        break;
//                                    case 6:
//                                        System.out.println(agencyDao.findByName("dew"));
//                                        break;
//                                    case 7:
//                                        a1 = true;
//
//                                }
//                            }
//                        }
////                }
//                }
//            }
//        }
//    }
//}
//
