package mirea.lab1;

public enum Seasons {AUTUMN(5),
    SUMMER(25){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    WINTER(-20),
    SPRING(-2);

    private final int meanTemp;

    private Seasons(int meanTemp) {
        this.meanTemp = meanTemp;
    }

    public String getDescription(){
        return "Холодное время года";
    }

    public int getMeanTemp(){
        return meanTemp;
    }
}

