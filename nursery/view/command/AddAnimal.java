package nursery.view.command;

import nursery.view.ConsoleUI;

public class AddAnimal extends Command{
    public AddAnimal(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Добавить животное";
    }
    @Override
    public void execute() {
        consoleUI.addAnimal();
    }
}
