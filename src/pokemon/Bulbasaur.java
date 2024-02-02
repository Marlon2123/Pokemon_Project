package pokemon;


public class Bulbasaur extends Pokemon implements IPlant {

    public Bulbasaur() {
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
                System.out.println("I am Bulbasaur and I am attacking");

    }

    @Override
    protected void attackScratch() {
        System.out.println("I am Bulbasaur and I am attacking with My Scratch Attack");
    }

    @Override
    protected void attackBite() {
        System.out.println("I am Bulbasaur and I am attacking with my Bite Attack");
    }

    @Override
    public void paralizedAttack() {
        System.out.println("I am Bulbasaur and I am attacking with my Patalized Attack");
    }

    @Override
    public void drainAttack() {
        System.out.println("I am Bulbasaur and I am attacking with my Drain Attack");
        
    }

    @Override
    public void sharpLeafAttack() {
        System.out.println("I am Bulbasaur and I am attacking with my Sharp Leaf Attack");
    }

    @Override
    public void whipCepaAttack() {
        System.out.println("I am Bulbasaur and I am attacking with my Cepa Whip Attack");
    }
    
    
    
}
