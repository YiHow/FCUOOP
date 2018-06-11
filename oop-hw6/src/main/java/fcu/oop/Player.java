package fcu.oop;

public class Player {

  private String playerName;
  private Pokemon[] pokemons;
  private int level = 1;
  
  Player(String playerName) {
    this.playerName = playerName;
  }
  
  public String getPlayerName() {
    return this.playerName;
  }
  
  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }
  
  public Pokemon[] getPokemons() {
    return this.pokemons;
  }
  
  public void setPokemons(Pokemon[] pokemons) {
    this.pokemons = pokemons;
  }
  
  public int getLevel() {
    return this.level;
  }
  
  public void setLevel(int level) {
    this.level = level;
  }
}
