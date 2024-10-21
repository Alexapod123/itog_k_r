package nursery.view.command;

import nursery.view.ConsoleUI;

public class SortedByBirthday extends Command{
    public SortedByBirthday(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать животных по дате рождения";
    }

    @Override
    public void execute() {
        consoleUI.sortedByBirthday();
    }
}
