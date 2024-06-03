package org.example.user;

import org.example.account.AccountService;

import java.util.*;

public class UserService {

    private final Map<Integer, User> userMap;
    private final Set<String> takenLogins;
    private final AccountService accountService;

    private int idCounter;

    public UserService(AccountService accountService) {
        this.accountService = accountService;
        this.userMap = new HashMap<>();
        this.idCounter = 0;
        this.takenLogins = new HashSet<>();
    }

    public User createUser(String login) {
        if(takenLogins.contains(login)){
            throw new IllegalArgumentException("User already exists with login=%s".formatted(login));
        }

        takenLogins.add(login);
        idCounter++;
        var newUser = new User(idCounter, login, new ArrayList<>());

        var newAccount = accountService.createAccount(newUser);
        newUser.getAccountList().add(newAccount);

        userMap.put(newUser.getId(), newUser);
        return newUser;
    }

    public Optional<User> findUserById(int id){
        return Optional.ofNullable(userMap.get(id));
    }

    public List<User> getAllUsers(){
        return userMap.values().stream().toList();
    }
}
