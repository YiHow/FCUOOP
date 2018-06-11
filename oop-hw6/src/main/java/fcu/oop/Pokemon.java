package fcu.oop;

public class Pokemon {

  private final String name;
  private final PokemonType type;
  private int cp;
  
  Pokemon(String name, PokemonType type, int cp) {
    this.name = name;
    this.type = type;
    this.cp = cp;
  }
  
  public String getName() {
    return this.name;
  }
  
  public PokemonType getType() {
    return this.type;
  }
  
  public int getCp() {
    return this.cp;
  }
  
  public void setCp(int cp) {
    this.cp = cp;
  }
}
