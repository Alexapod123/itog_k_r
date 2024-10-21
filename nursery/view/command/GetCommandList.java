package nursery.view.command;

import nursery.view.ConsoleUI;

public class GetCommandList extends Command{
    public GetCommandList(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список команд, выполняемых животным";
    }

    @Override
    public void execute() {
        consoleUI.getCommandList();
    }
}
