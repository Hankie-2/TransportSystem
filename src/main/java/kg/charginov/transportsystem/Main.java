package kg.charginov.transportsystem;

import kg.charginov.transportsystem.model.Carriage;
import kg.charginov.transportsystem.model.Train;
import kg.charginov.transportsystem.service.CreateCarriagesInterface;
import kg.charginov.transportsystem.service.PrintTrainFieldInterface;
import kg.charginov.transportsystem.service.impl.CreateCarriages;
import kg.charginov.transportsystem.service.impl.PrintTrainFields;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train();
        CreateCarriagesInterface createCarriages = new CreateCarriages();
        PrintTrainFieldInterface printTrainFields = new PrintTrainFields();

        List<Carriage> carriages = createCarriages.createCarriages();
        train1.setCarriages(carriages);

        System.out.println(printTrainFields.getAmountOfAllBaggage(carriages));
        System.out.println(printTrainFields.getAmountOfAllPeople(carriages));


        printTrainFields.printCarriages(carriages); // вывод информации о всех вагонах
        System.out.println();
        System.out.println("===================================================");
        printTrainFields.printCarriagesWithRange(300,800,carriages); // вывод информации о всех вагонах с диапазоном

    }
}
