package kg.charginov.transportsystem.model;

import kg.charginov.transportsystem.model.enums.CarriageClass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Train {

    List<Carriage> carriages;

}
