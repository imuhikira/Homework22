

package edu.dmacc.codedsm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {
    private GameLogic gameLogicJunitTest;
    private GameRunnerImpl runner;

    @Before
    public void setUp() throws Exception {
        this.gameLogicJunitTest = new GameLogic(runner);
    }

    @Test
    public void runGameTest() {
        GameResult TestResult = new GameResult();
        gameLogicJunitTest = new GameLogic(new GameRunnerImpl());
        TestResult.setPlayer("Peace");
        assertEquals(TestResult.getPlayer(), gameLogicJunitTest.runGame("Peace").getPlayer());
    }

    @Test
    public void buildResultTest() {
        GameResult TestResult = new GameResult();
        gameLogicJunitTest = new GameLogic(new GameRunnerImpl());
        TestResult.setScore(800);
        assertEquals(TestResult.getScore(), gameLogicJunitTest.buildResult("Peace", 800).getScore());
    }
}