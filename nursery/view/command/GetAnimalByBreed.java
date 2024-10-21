package nursery.view.command;

import nursery.view.ConsoleUI;

public class GetAnimalByBreed extends Command{
    public GetAnimalByBreed(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список животных по породе";
    }

    @Override
    public void execute() {
        consoleUI.getAnimalByBreed();
    }
}
