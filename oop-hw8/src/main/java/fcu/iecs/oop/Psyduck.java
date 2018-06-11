package fcu.iecs.oop;

public class Psyduck extends Pokemon {

  public Psyduck(String nickName, PokemonType type, int cp) {
    super(nickName, type, cp);
  }

  @Override
  public void attck() {
    System.out.println("Aqua tail...");
  }
}
