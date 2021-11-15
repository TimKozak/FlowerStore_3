package users;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sender implements User{
    private int id;
    private String status;

    public Sender() {
        this.id = IdCounter.addNewId();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
