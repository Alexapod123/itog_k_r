package nursery.model;

import java.time.LocalDate;
import java.util.List;

public class Dogs extends Pets {
    public Dogs(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }

    @Override
    public String getView() {
        return "Dog";
    }

    @Override
    public String toString() {
        return "Dogs:" +
                "name: " + name +
                ", breed: " + breed +
                ", colour: " + colour +
                ", birthday: " + birthday +
                ", commands: " + commands +
                '\n';
    }
}
