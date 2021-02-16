package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground implements ISecurity {
    private String name;
    private int rating;

    public Playground(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }



    public int getRating() {
        return this.rating;
    }


    public int getVisitCount() {
        return this.getVisitCount();
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15 ? true : false;
    }

}
