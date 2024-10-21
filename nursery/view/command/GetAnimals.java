package nursery.view.command;

import nursery.view.ConsoleUI;

public class GetAnimals extends Command{
    public GetAnimals(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Вывести список всех животных";
    }

    @Override
    public void execute() {
        consoleUI.getAnimals();
    }
}
