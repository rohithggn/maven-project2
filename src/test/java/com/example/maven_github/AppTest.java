package com.example.maven_github;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for App.
 */
public class AppTest {

    
    App app = new App();

    @Test
    public void averageofTwoNumbers() {
        
        assertEquals(1, app.AvgofTwo(1, 2));
    }

    @Test
    public void averageofThreeNumbers() {
        assertEquals(2, app.AvgofThree(1, 2, 3));
    }
}