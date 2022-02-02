import org.junit.jupiter.api.Assertions;

class RobotTest {
    Robot botM  = new Robot("botMaster");
    Robot botN = new Robot("botNinja");

    @Test
    void testBotName(){
        if(assertNotNull(botM)){
            assertEquals(botM.getNom(), "botMaster");
        }
    }
    //le robot touché(botN) doit perdre 2 points de vie.
    @Test
    void testFire(){
            botM.fire(botN);
            int val = botN.getPvie() - 2;
            assertEquals(botN.getPvie(), val);
    }

    //si les points de vie passent au négatif, alors on peut tirer sur des robots morts.
    @Test
    void testFireDead(){
        botM.setVie(0);
        botN.fire(botM);
        assertTrue(botM.getPvie() => 0);
    }

    botM.setPvie(10);
    botN.setPvie(10);

    //le premier à tirer (botN) doit gagner si les combattants ont le meme nombre de points de vie.
    @Test
    void testFight(){
        assertEquals(botN, fight(botN,botM));
    }


}