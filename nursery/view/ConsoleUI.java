package nursery.view;

import nursery.model.*;
import nursery.presenter.Presenter;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View{
    private static final String error = "Ошибочный ввод!";
    private Scanner scanner;
    private Presenter presenter;
    private boolean isWork;
    private MainMenu menu;
    private Service service;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        isWork = true;
        menu = new MainMenu(this);
        service = new Service();
    }

    @Override
    public void start() {
        hello();
        while (isWork){
            printMenu();
            execute();
        }
    }
    @Override
    public String printAnswer(String answer) {
        System.out.println(answer);
        return answer;
    }
    private void hello(){
        printAnswer("Приветствуем!");
    }
    private void execute(){
        String line = scanner.nextLine();
        if(checkInput(line)){
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)){
                menu.execute(numCommand);
            }
        }
    }
    private boolean checkCommand(int nunCommand){
        if (nunCommand<=menu.getSize()){
            return true;
        }
        else {
            inputError();
            return false;
        }
    }
    private void inputError(){
        printAnswer(error);
    }
    private boolean checkInput (String input){
        if (input.matches("[0-8]+")){
            return true;
        }
        else {
            inputError();
            return false;
        }
    }
    private void printMenu(){
        printAnswer(menu.menu());
    }
    public void finish(){
        printAnswer("До новых встреч!");
        isWork = false;
    }
    public void addAnimal(){
        try {
            System.out.print("Введите тип животного (Dog, Cat, Hamster, Horse, Camel, Donkey): ");
            String type = scanner.nextLine();
            System.out.print("Введите имя животного: ");
            String name = scanner.nextLine();
            System.out.print("Введите дату рождения (YYYY-MM-DD): ");
            String birthDateStr = scanner.nextLine();
            LocalDate birthday = LocalDate.parse(birthDateStr);
            System.out.print("Введите породу животного: ");
            String breed = scanner.nextLine();
            System.out.print("Введите цвет животного: ");
            String colour = scanner.nextLine();
            System.out.print("Введите команды (через запятую): ");
            String commandsStr = scanner.nextLine();
            List<String> commands = Arrays.asList(commandsStr.split(",\\s*"));

            Animals animal = null;
            switch (type.toLowerCase()){
                case "cat":
                    animal = new Cats(name, breed, colour, birthday,commands);
                    break;
                case "dog":
                    animal = new Dogs(name, breed, colour, birthday,commands);
                    break;
                case "hamster":
                    animal = new Hamsters(name, breed, colour, birthday,commands);
                    break;
                case "camel":
                    animal = new Camels(name, breed, colour, birthday,commands);
                    break;
                case "horse":
                    animal = new Horses(name, breed, colour, birthday,commands);
                    break;
                case "donkey":
                    animal = new Donkeys(name, breed, colour, birthday,commands);
                    break;
                default:
                    inputError();
            }
            presenter.addAnimal(animal);
        } catch (DateTimeParseException | NumberFormatException e){
            inputError();
        }
    }
    public void addCommand(){
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите новую команду: ");
        String command = scanner.nextLine();
        boolean success = presenter.addCommand(name, command);
        if (success) {
            System.out.println("Команда добавлена успешно.");
        } else {
            System.out.println("Животное не найдено.");
        }
    }
    public void getAmount(){
        int amount = presenter.getAmount();
        System.out.print("Общее количество животных на данный момент " + amount + "\n");
    }
    public void getAnimalByBreed(){
        System.out.print("Введите породу: ");
        String breed = scanner.nextLine();
        printAnswer(presenter.getAnimalByBreed(breed));

    }
    public void getAnimals(){
        String animals = presenter.getAnimalsInfo();
        System.out.print(animals + "\n");
    }
    public void getCommandList(){
        printAnswer("Введите имя животного: ");
        String name = scanner.nextLine();
        String commands = presenter.getCommandList(name);
        if (commands != null) {
            System.out.println("Команды для " + name + ": " + String.join(", ", commands));
        } else {
            System.out.println("Животное не найдено.");
        }
    }
    public void sortedByBirthday(){
        printAnswer(presenter.sortedByBirthday());
    }
}
