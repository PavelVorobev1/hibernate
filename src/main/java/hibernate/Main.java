package hibernate;

import hibernate.Dao.ProductDao;
import hibernate.Dao.UserDao;
import hibernate.Objects.Product;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);
            UserDao userDao = new UserDao(sessionFactoryUtils);
            Product product = new Product("Carrot",5);
            Product product2 = new Product(4l,"Test",99);
//            System.out.println("/////productDao.findById(2) = " + productDao.findById(2l));
//            System.out.println("/////productDao.findAll() = " + productDao.findAll());
//            System.out.println("/////productDao.findAll() = " + productDao.findAll());
//            productDao.saveOrUpdate(product);
//            System.out.println("/////productDao.findAll() = " + productDao.findAll());
//            productDao.saveOrUpdate(product2);
//            System.out.println("/////productDao.findAll() = " + productDao.findAll());
            System.out.println("userDao.findById(2l) = " + userDao.findById(2l));


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
