package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDoFormatWithCodeAndLineEndingTest_WithEmptyCode {

    @Test
    public void doFormatWithCodeAndLineEndingTest_WithEmptyCode() {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        String code = "";
        LineEnding ending = LineEnding.UNIX;

        // Act
        String result = formatter.doFormat(code, ending);

        // Assert
        assertEquals(null, result);
    }

}