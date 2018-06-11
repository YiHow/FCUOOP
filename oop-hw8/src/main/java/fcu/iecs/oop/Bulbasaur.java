package fcu.iecs.oop;

public class Bulbasaur extends Pokemon {

  public Bulbasaur(String nickName, PokemonType type, int cp) {
    super(nickName, type, cp);
  }

  @Override
  public void attck() {
    System.out.println("Tackle...");
  }

}
