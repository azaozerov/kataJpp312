package ru.zaozerov.kataJpp312.dao;

import ru.zaozerov.kataJpp312.model.User;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoJpa implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void createUser(User user) {
        entityManager.persist(user);
    }

    public User readUser(Long id) {
        return entityManager.find(User.class, id);
    }

    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public void deleteUser(Long id) {
        entityManager.remove( entityManager.find(User.class, id) );
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user").getResultList();
    }
}
