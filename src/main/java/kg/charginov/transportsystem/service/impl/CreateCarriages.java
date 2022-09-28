package kg.charginov.transportsystem.service.impl;

import kg.charginov.transportsystem.model.Carriage;
import kg.charginov.transportsystem.model.enums.CarriageClass;
import kg.charginov.transportsystem.service.CreateCarriagesInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateCarriages implements CreateCarriagesInterface {

    @Override
    public List<Carriage> createCarriages(){
        Random r = new Random();
        List<Carriage> carriages = new ArrayList<>();

        int size = r.nextInt(10-1) + 1; // Рандомные число от 1 до 10 для количества вагонов

        for(int i = 0;i<=size;i++){
            int people = r.nextInt(1000-10)+10; // Рандомные число от 10 до 1000 для количества людей
            int baggage = r.nextInt(2000-50)+50; // Рандомные число от 50 до 2000 для количества багажа
            int _class = r.nextInt(3-1)+1; // рандомное число от 1 до 3 для класса вагона
            Carriage carriage = new Carriage(baggage,people,intToClass(_class));
            carriages.add(carriage);
        }
        return carriages;
    }

    private static CarriageClass intToClass(int _class){
        return switch (_class) {
            case 1 -> CarriageClass.STANDARD;
            case 2 -> CarriageClass.COMFORT;
            case 3 -> CarriageClass.BUSINESS;
            default -> null;
        };
    }

}
