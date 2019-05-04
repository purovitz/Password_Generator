package generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratorTest {

    private Generator generatorUnderTest;

    @BeforeEach
    public void setUp() {
        generatorUnderTest = new Generator();
    }



    @Test
    public void testGeneratePassword1() {
        // Setup

        // Run the test
        generatorUnderTest.generatePassword();

        // Verify the results
    }

    @Test
    public void testPasswordLength() {
        // Setup
        final Integer expectedResult = 0;

        // Run the test
        final Integer result = generatorUnderTest.passwordLength();

        // Verify the results 
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPasswordTest() {
        // Setup

        // Run the test
        generatorUnderTest.passwordTest();

        // Verify the results 
    }

    @Test
    public void testIncludeSymbols() {
        // Setup

        // Run the test
        final boolean result = generatorUnderTest.includeSymbols();

        // Verify the results 
        assertTrue(result);
    }

    @Test
    public void testIncludeNumbers() {
        // Setup

        // Run the test
        final boolean result = generatorUnderTest.includeNumbers();

        // Verify the results 
        assertTrue(result);
    }

    @Test
    public void testIncludeLowercaseCharacters() {
        // Setup

        // Run the test
        final boolean result = generatorUnderTest.includeLowercaseCharacters();

        // Verify the results 
        assertTrue(result);
    }

    @Test
    public void testIncludeUppercaseCharacters() {
        // Setup

        // Run the test
        final boolean result = generatorUnderTest.includeUppercaseCharacters();

        // Verify the results 
        assertTrue(result);
    }

    @Test
    public void testGeneratePassword() {
        // Setup

        // Run the test
        generatorUnderTest.generatePassword();

        // Verify the results 
    }

    @Test
    public void testMakePassword() {
        // Setup
        final int len = 0;
        final String dic = "dic";
        final String expectedResult = "result";

        // Run the test
        final String result = Generator.makePassword(len, dic);

        // Verify the results 
        assertEquals(expectedResult, result);
    }
}
