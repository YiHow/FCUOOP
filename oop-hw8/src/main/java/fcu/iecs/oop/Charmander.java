package fcu.iecs.oop;

public class Charmander extends Pokemon {

  public Charmander(String nickName, PokemonType type, int cp) {
    super(nickName, type, cp);
  }

  @Override
  public void attck() {
    System.out.println("Ember...");
  }

}
