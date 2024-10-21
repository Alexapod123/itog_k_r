package nursery.model;

import java.time.LocalDate;
import java.util.List;

public class Horses extends PackAnimals {
    public Horses(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }

    @Override
    public String getView() {
        return "Horse";
    }

    @Override
    public String toString() {
        return "Horses: " +
                "name: " + name +
                ", breed: " + breed +
                ", colour: " + colour +
                ", birthday: " + birthday +
                ", commands: " + commands +
                '\n';
    }
}
