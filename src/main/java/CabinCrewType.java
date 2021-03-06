public enum CabinCrewType {
    CAPTAIN("Sergio", "Captain"),
    COPILOT("Simon", "Copilot"),
    FIRSTOFFICER("Lilith", "First Officer"),
    FLIGHTATTENDANT("Victor", "Flightattendant"),
    PURSER("Gimme ur purse", "Purser");

    private final String name;
    private final String rank;

    CabinCrewType(String name, String rank){
        this.name = name;
        this.rank = rank;
    }
    public String getName(){

        return name;
    }

    public String getRank() {
        return rank;
    }
}

