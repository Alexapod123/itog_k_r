package nursery.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static nursery.model.Numeration.*;

public class Service {
    private final List<Animals> animals;

    public Service() {
        animals = new ArrayList<>();
        setCount(animals.size());
    }
    public void addAnimal(Animals animal){
        animals.add(animal);
        nums();
    }
    public List<String> getCommandList (String name){
        for (Animals animal: animals){
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal.getCommands();
            }
        } return Collections.singletonList(name);
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
        List<Animals> animalbybreed = new ArrayList<>();
        for (Animals animal: animals){
            if (animal.getBreed().equalsIgnoreCase(breed)){
               animalbybreed.add(animal);
            }
        }
        return animalbybreed;
    }
    public List<Animals> sortedByBirthday(List <Animals>animals){
        animals.sort(Comparator.comparing(Animals::getBirthday));
        return animals;
    }
    public int getAmount(){
        return getCount();
    }
    public List<Animals> getAnimals(){
        return animals;
    }

}
