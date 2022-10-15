package hibernate.Dao;

import hibernate.SessionFactoryUtils;
import hibernate.Objects.User;
import org.hibernate.Session;

import java.util.List;

public class UserDao {

    private SessionFactoryUtils sessionFactoryUtils;

    public UserDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public User findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            User user = session.get(User.class, id);
            return user;
        }
    }

    public List<User> findAll() {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            List<User> user = session.createQuery("select p from User p").getResultList();
            return user;
        }
    }

}
