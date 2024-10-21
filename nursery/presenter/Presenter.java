package nursery.presenter;

import nursery.model.Animals;
import nursery.model.Service;
import nursery.view.View;

import java.util.ArrayList;
import java.util.List;

public class Presenter {
    private final View view;
    private final Service service;

    public Presenter(View view) {
        this.service = new Service();
        this.view = view;
    }
    public void addAnimal(Animals animal){
        service.addAnimal(animal);
        getAnimalsInfo();
    }
    public String getCommandList(String name){
        return service.getCommandList(name).toString();
    }
    public boolean addCommand (String name,String command){
        return service.addCommand(name, command);
    }
    public String getAnimalByBreed (String breed){
        return service.getAnimalByBreed(breed).toString();
    }
    public String sortedByBirthday (){
        List<Animals>sort = new ArrayList<>();
        sort = service.getAnimals();
        return service.sortedByBirthday(sort).toString();
    }
    public int getAmount(){
        return service.getAmount();
    }
    public String getAnimalsInfo(){
        return service.getAnimals().toString();

    }


}
