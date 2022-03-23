package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.models.User;

public class UserServiceImplements implements UserService{

    private final UserDao userDao;

    public UserServiceImplements(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user){
        userDao.addUser(user);
    }

    @Override
    public User getById(long id){
        return userDao.getById();
    }

    @Override
    public void updateUser(User user, Long id){
        userDao.updateUser(user, id);
    }

    @Override
    public void deleteUser(Long id){
        userDao.deleteUser(id);
    }

    @Override
    public User get(Long id){
        return userDao.get(id);
    }
}
