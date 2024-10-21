package nursery.model;

import java.time.LocalDate;
import java.util.List;

public abstract class Pets extends Animals {

    public Pets(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }
}
