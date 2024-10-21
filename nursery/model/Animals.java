package nursery;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animals {
    protected String name;
    protected String breed;
    protected String colour;
    protected LocalDate birthday;
    protected List<String> commands;

    public Animals(String name, String breed, String colour, LocalDate birthday, List<String> commands) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.birthday = birthday;
        this.commands = new ArrayList<>(commands);
    }
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getCommands() {
        return commands;
    }
    public void addCommand(String command) {
        commands.add(command);
    }
    public abstract String getView();
}
