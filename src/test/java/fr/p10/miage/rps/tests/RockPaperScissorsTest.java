package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.*;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
        rps = new RockPaperScissors();

    }

    @AfterClass
    public void tearDown() throws Exception {
        rps = null;

    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);
    }

    @Parameters({"paper","paper"})
    @Test
    public void testTiePlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);
    }

    @Parameters({"scissors","rock"})
    @Test
    public void testLostPlay(String p1, String p2) throws Exception {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);
    }
}
