package nursery.model;

import java.time.LocalDate;
import java.util.List;

public class Camels extends PackAnimals {
    public Camels(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }

    @Override
    public String getView() {
        return "Camel";
    }

    @Override
    public String toString() {
        return "Camels: " +
                "name: " + name +
                ", breed: " + breed +
                ", colour: " + colour +
                ", birthday: " + birthday +
                ", commands: " + commands +
                '\n';
    }
}
