package nursery.view.command;

import nursery.view.ConsoleUI;

public class GetAmount extends Command{
    public GetAmount(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить общее количество животных";
    }

    @Override
    public void execute() {
        consoleUI.getAmount();
    }
}
