package Animal.domain.interfaces;

import Animal.domain.interfaces.Animal;

public interface Feedable <T extends Animal>{
    Boolean eat(T food);
}
