package pokemon;


public class Squirtle extends Pokemon implements IWater {

    public Squirtle() {
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
        System.out.println("I am Squirtle and I am attacking");
    }

    @Override
    protected void attackScratch() {
        System.out.println("I am Squirtle and I am attacking with my Scratch Attack");
    }

    @Override
    protected void attackBite() {
        System.out.println("I am Squirtle and I am attacking with my Bite Attack");
    }

    @Override
    public void hidroBombAttack() {
        System.out.println("I am Squirtle and I am attacking with my Hydro Bomb");
    }

    @Override
    public void waterGunAttack() {
        System.out.println("I am Squirtle and I am with my Water Gun Attack");
    }

    @Override
    public void bubblesAttack() {
        System.out.println("I am Squirtle and I am with my Bubbles Attack");
    }

    @Override
    public void hydroPulseAttack() {
        System.out.println("I am Squirtle and I am with my Hydro Pulse Attack");
    }
    
}
