package nursery;

import java.time.LocalDate;
import java.util.List;

public class Cats extends Pets{

    public Cats(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        super(name, breed, colour, birthday, commands);
    }

    @Override
    public String getView() {
        return "Cat";
    }
}
