package users;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdCounter {
    static int lastId = 0;

    public static int addNewId() {
        lastId++;
        return lastId;
    }
}
