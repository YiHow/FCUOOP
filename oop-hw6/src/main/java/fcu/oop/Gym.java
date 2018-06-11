package fcu.oop;

import java.util.Random;

public class Gym {
  /**
   * choose the winner
   * @param players player1 and player2
   * @return winner
   */
  public static Player fight(Player... players) {
    Player p1 = players[0];
    Player p2 = players[1];
    Player winner;
    Pokemon[] pkm1 = p1.getPokemons();
    Pokemon[] pkm2 = p2.getPokemons();
    PokemonType oneType;
    PokemonType twoType; 
    int cp1;
    int cp2;
    int p1wins = 0;
    int p2wins = 0;
    Random random = new Random();
    int pick;
    for (int i = 0; i < 3; i++) {
      //System.out.println("The" + i + "game!");
      oneType = pkm1[i].getType();
      twoType = pkm2[i].getType();
      //比屬性-------------------------
      if (oneType != twoType) {
        switch (oneType) {
          case FIRE: 
            switch (twoType) {
              case WATER:
                p2wins++;
                break;
              case GRASS:
                p1wins++;
                break;
              default:
                break;
            }
            break;
          case WATER:
            switch (twoType) {
              case FIRE:
                p1wins++;
                break;
              case GRASS:
                p2wins++;
                break;
              default:
                break;
            }
            break;
          case GRASS:
            switch (twoType) {
              case FIRE:
                p2wins++;
                break;
              case WATER:
                p1wins++;
                break;
              default:
                break; 
            }
            break;
          default:
            break;
        }
      //比屬性-------------------------
      } else {
        //比CP------------------------
        cp1 = pkm1[i].getCp();
        cp2 = pkm2[i].getCp();
        if (cp1 > cp2) {
          p1wins++;
        } else if (cp2 > cp1) {
          p2wins++;
        //比CP------------------------
        } else {
        //隨機勝負--------------------
          pick = random.nextInt(2);
          //System.out.println(pick);
          if (pick == 1) {
            p1wins++;
          } else {
            p2wins++;
          }
        }
        //隨機勝負--------------------
      }
    }
    if (p1wins > p2wins) {
      winner = p1;
    } else {
      winner = p2;
    }
    winner.setLevel(winner.getLevel() + 1);
    System.out.println("Winner is " + winner.getPlayerName() 
        + ", and his level becomes " + winner.getLevel());
    return winner;
  }
}
