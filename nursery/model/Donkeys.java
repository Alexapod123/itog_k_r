package nursery.model;

import java.time.LocalDate;
import java.util.List;

public class Donkeys extends PackAnimals {
    public Donkeys(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }

    @Override
    public String getView() {
        return "Donkey";
    }

    @Override
    public String toString() {
        return "Donkeys: " +
                "name: " + name +
                ", breed: " + breed +
                ", colour: " + colour +
                ", birthday: " + birthday +
                ", commands: " + commands +
                '\n';
    }
}
