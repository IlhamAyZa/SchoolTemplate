package az.aidazade.school.main;

import java.util.List;

public class Jurnal {
    
    public List<JurnalItem> jurnalItems;

    public Jurnal(List<JurnalItem> jurnalItems) {
        this.jurnalItems = jurnalItems;
    }

    public Jurnal() {
    }

    public List<JurnalItem> getJurnal() {
        return jurnalItems;
    }

    public void setJurnalItem(List<JurnalItem> jurnalItems) {
        this.jurnalItems = jurnalItems;
    }
       
}
