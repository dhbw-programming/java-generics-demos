package harbor;

import java.util.ArrayList;
import java.util.Collections;

public class Harbor {
    public static void main(String[] args) {
        ArrayList<Ship<Object>> ships  = new ArrayList<>();
        ships.add(new Ship<>("tea", 1));
        ships.add(new Ship<>(42, 42));
        ships.add(new Ship<>("iron", 2));

        Collections.sort(ships);

        for (Ship<Object> ship : ships) {
            System.out.println(ship.getContents().toString());
        }
    }
}
