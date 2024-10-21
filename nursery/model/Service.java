package nursery.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Register {
    private List<Animals> animals;

    public Register(List<Animals> animals) {
        animals = new ArrayList<>();
        Numeration.setCount(animals.size());
    }
    public void addAnimals(Animals animal){
        animals.add(animal);
        Numeration.nums();
    }
    public List <String> getCommandList (String name){
        for (Animals animal: animals){
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal.getCommands();
            }
        }
        return null;
    }
    public boolean addCommand (String name, String command){
        for (Animals animal: animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.addCommand(command);
                return true;
            }
        }
        return false;
    }
    public List<Animals> getAnimalByBreed (String breed){
        List<Animals> animalbybreed = new ArrayList<>(animals);
        for (Animals animal: animals){
            if (animal.getBreed().equalsIgnoreCase(breed)){
               animalbybreed.add(animal);
            }
        }
        return animalbybreed;
    }
    public List<Animals> sortedByBirthday(){
        List<Animals> sortedList = new ArrayList<>(animals);
        sortedList.sort(Comparator.comparing(Animals::getBirthday));
        return sortedList;
    }
    public int getAmount(){
        return Numeration.getCount();
    }
    public List<Animals> getAnimals(){
        return animals;
    }
}
