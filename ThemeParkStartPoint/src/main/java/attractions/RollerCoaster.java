package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  implements ISecurity {
    private String name;
    private int rating;
    private int visitCount;

    public RollerCoaster(String name, int rating, int visitCount) {
        this.name = name;
        this.rating = rating;
        this.visitCount = visitCount;
    }


    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public int getVisitCount() {
        return this.visitCount;
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() >13 && visitor.getHeight() > 145;
    }


}
