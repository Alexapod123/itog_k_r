package nursery.model;

import java.time.LocalDate;
import java.util.List;

public class Hamsters extends Pets {
    public Hamsters(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }

    @Override
    public String getView() {
        return "Hamster";
    }

    @Override
    public String toString() {
        return "Hamsters" +
                "name: " + name +
                ", breed: " + breed +
                ", colour: " + colour +
                ", birthday: " + birthday +
                ", commands: " + commands +
                '\n';
    }
}
