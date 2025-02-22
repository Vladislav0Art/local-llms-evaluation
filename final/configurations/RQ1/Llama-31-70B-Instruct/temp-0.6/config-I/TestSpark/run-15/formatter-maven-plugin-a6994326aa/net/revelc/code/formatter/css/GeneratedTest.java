package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void doFormatWithCodeAndLineEndingTest() {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        String code = "some code";
        LineEnding ending = LineEnding.UNIX;
        String expectedResult = "some result";

        // Act
        String result = formatter.doFormat(code, ending);

        // Assert
        assertEquals(expectedResult, result);
    }

}