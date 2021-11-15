package users;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Receiver implements User {
    private int id;
    private String status;

    public Receiver() {
        this.id = IdCounter.addNewId();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
