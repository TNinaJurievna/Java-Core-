package dz4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Phonebook {

    HashMap<String, Set<String>> hashMap = new HashMap<>();

    public void add(String userName, String phone) {
        if (userName.isBlank() || phone.isBlank()) return;
        Set<String> currentPhones;
        if (hashMap.containsKey(userName)) {
            currentPhones = hashMap.get(userName);
        } else {
            currentPhones = new HashSet<>();
        }
        currentPhones.add(phone);
        hashMap.put(userName, currentPhones);
    }

    public Set<String> get(String userName) {
        if (userName.isBlank()) return null;
        return hashMap.getOrDefault(userName, null);
    }
}
