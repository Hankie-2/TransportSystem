package kg.charginov.transportsystem.service.impl;

import kg.charginov.transportsystem.model.Carriage;
import kg.charginov.transportsystem.service.PrintTrainFieldInterface;

import java.util.Collections;
import java.util.List;

public class PrintTrainFields implements PrintTrainFieldInterface {

    @Override
    public String getAmountOfAllPeople(List<Carriage> carriages){
        int amount = 0;
        for(Carriage carriage:carriages){
            amount+=carriage.getPeopleCapacity();
        }
        return amount + " людей в поезде";
    }

    @Override
    public String getAmountOfAllBaggage(List<Carriage> carriages){
        int amount = 0;
        for(Carriage carriage:carriages){
            amount+=carriage.getBaggageCapacity();
        }
        return amount + " багажа в поезде";
    }

    @Override
    public void printCarriagesWithRange(int min, int max,List<Carriage> carriages){
        Collections.sort(carriages);
        System.out.format("%s%12s%12s%12s", "Carriage №", "Baggage", "People","Class");
        for(int i = 0,j=1;i<carriages.size();i++){
            if(carriages.get(i).getPeopleCapacity()>min && carriages.get(i).getPeopleCapacity()<max){
                System.out.println();
                System.out.format("%d%19d%12d%15s", j++,carriages.get(i).getBaggageCapacity() , carriages.get(i).getPeopleCapacity(),carriages.get(i).getCarriageClass());
            }
        }
    }

    @Override
    public void printCarriages(List<Carriage> carriages){
        Collections.sort(carriages);
        System.out.format("%s%12s%12s%12s", "Carriage №", "Baggage", "People","Class");
        for(int i = 0,j=1;i<carriages.size();i++){
            System.out.println();
            System.out.format("%d%19d%12d%15s", j++,carriages.get(i).getBaggageCapacity() , carriages.get(i).getPeopleCapacity(),carriages.get(i).getCarriageClass());

        }
    }

}
