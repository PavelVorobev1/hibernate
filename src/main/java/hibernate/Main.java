package hibernate;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);
            Product product = new Product("Carrot",5);
            Product product2 = new Product(4l,"Test",99);
            System.out.println("/////productDao.findById(2) = " + productDao.findById(2l));
            System.out.println("/////productDao.findAll() = " + productDao.findAll());
            productDao.deleteById(2l);
            System.out.println("/////productDao.findAll() = " + productDao.findAll());
            productDao.saveOrUpdate(product);
            System.out.println("/////productDao.findAll() = " + productDao.findAll());
            productDao.saveOrUpdate(product2);
            System.out.println("/////productDao.findAll() = " + productDao.findAll());

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
