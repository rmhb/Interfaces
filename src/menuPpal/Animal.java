/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuPpal;

import java.util.EnumMap;

/**
 *
 * @author NASA
 */
public class Animal {
    
    public enum Especie{VERTEBRADOS, ANFIBIOS, REPTILES};
//    public  EnumMap<Especie, String> especieAnimal = new EnumMap<>(Especie.class);
//    especieAnimal.put(Especie.VERTEBRADOS, "VERTEBRADOS");
//    especieAnimal.put(Especie.ANFIBIOS, "ANFIBIOS");
//    especieAnimal.put(Especie.REPTILES, "REPTILES");
//
//    String levelValue = especieAnimal.get(Especie.REPTILES);  
//    
    enum ItemType {
    First("First choice"), Second("Second choice"), Third("Final choice");
    private final String display;
    private ItemType(String s) {
        display = s;
    }
    @Override
    public String toString() {
        return display;
    }
}

}
