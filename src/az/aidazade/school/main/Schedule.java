package az.aidazade.school.main;

import az.aidazade.school.main.SheduleItem;
import java.util.List;

public class Schedule {

    public List<SheduleItem> sheduleItems;

    public Schedule(List<SheduleItem> sheduleItems) {
        this.sheduleItems = sheduleItems;
    }

    public Schedule() {
    }

    public List<SheduleItem> getSheduleItems() {
        return sheduleItems;
    }

    public void setSheduleItems(List<SheduleItem> sheduleItems) {
        this.sheduleItems = sheduleItems;
    }

}
