package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class AnimalsCage {

    private  Timer timer;


    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public Timer getTimer() {
        return timer;
    }

    public AnimalsCage(Timer timer) {
        this.timer = timer;
    }



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
