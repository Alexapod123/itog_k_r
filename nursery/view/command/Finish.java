package nursery.view.command;

import nursery.view.ConsoleUI;

public class Finish extends Command{
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Выход";
    }

    @Override
    public void execute() {
        consoleUI.finish();

    }
}
