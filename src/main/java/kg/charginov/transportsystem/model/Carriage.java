package kg.charginov.transportsystem.model;

import kg.charginov.transportsystem.model.enums.CarriageClass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Carriage implements Comparable<Carriage>{

    Integer baggageCapacity;

    Integer peopleCapacity;

    CarriageClass carriageClass;

    public Carriage(Integer baggageCapacity, Integer peopleCapacity, CarriageClass carriageClass){
        if(baggageCapacity <= 0 || peopleCapacity <= 0){
            throw new IllegalArgumentException("Вместимость должно быть больше 0");
        }
        this.baggageCapacity = baggageCapacity;
        this.peopleCapacity = peopleCapacity;
        this.carriageClass = carriageClass;
    }


    @Override
    public int compareTo(Carriage o) {
        return o.carriageClass.compareTo(this.carriageClass);
    }
}
