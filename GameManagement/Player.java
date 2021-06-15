class Player {
    private String name = "";
    private int countWins;
    private int countLosses;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountWins() {
        return this.countWins;
    }

    public int getCountLosses() {
        return this.countLosses;
    }

    public void addWin() {
        this.countWins++;
    }

    public void addLoss() {
        this.countLosses++;
    }
}