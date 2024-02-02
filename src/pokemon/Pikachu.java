package pokemon;


public class Pikachu extends Pokemon implements IElectric  {

    public Pikachu() {
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public double getPokemonWheight() {
        return pokemonWheight;
    }

    public void setPokemonWheight(double pokemonWheight) {
        this.pokemonWheight = pokemonWheight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSeasonThatAppears() {
        return seasonThatAppears;
    }

    public void setSeasonThatAppears(int seasonThatAppears) {
        this.seasonThatAppears = seasonThatAppears;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    
    
    @Override
    protected void attack() {
        System.out.println("I am Pikachu and I am Attaking");
    }

    @Override
    protected void attackScratch() {
        System.out.println("I am Pikachu and I am Attaking with my Scratch Attack");
    }

    @Override
    protected void attackBite() {
        System.out.println("I am Pikachu and I am Attaking with my Bite Attack");
    }

    @Override
    public void atackThunderImpact() {
        System.out.println("I am Pikachu and I am Attaking with my Scratch Attack");
    }

    @Override
    public void attackThunderFist() {
        System.out.println("I am Pikachu and I am Attaking with my thunder fist");
    }

    @Override
    public void attackBolt() {
        System.out.println("I am Pikachu and I am Attaking with my Bolts");
        
    }

    @Override
    public void attackBoltCharge() {
        System.out.println("I am Pikachu and I am Attaking with my Bolt Charge");
    }
    
}
