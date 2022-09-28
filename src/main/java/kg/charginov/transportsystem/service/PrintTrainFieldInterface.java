package kg.charginov.transportsystem.service;

import kg.charginov.transportsystem.model.Carriage;

import java.util.List;

public interface PrintTrainFieldInterface {

    public void printCarriages(List<Carriage> carriages);

    public void printCarriagesWithRange(int min, int max,List<Carriage> carriages);

    public String getAmountOfAllBaggage(List<Carriage> carriages);

    public String getAmountOfAllPeople(List<Carriage> carriages);

}
