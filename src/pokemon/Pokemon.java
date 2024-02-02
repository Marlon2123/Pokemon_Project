
package pokemon;


public abstract class Pokemon {

        protected int num_pokedex;
        protected String pokemonName;
        protected double pokemonWheight;
        protected String sex;
        protected int seasonThatAppears;
        protected String kind;
        
        protected abstract void attack();
        protected abstract void attackScratch();
        protected abstract void attackBite();

    
    
}
