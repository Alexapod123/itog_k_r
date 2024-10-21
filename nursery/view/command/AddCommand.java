package nursery.view.command;

import nursery.view.ConsoleUI;

public class AddCommand extends Command{
    public AddCommand(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить команду для животного";
    }

    @Override
    public void execute() {
        consoleUI.addCommand();
    }
}
