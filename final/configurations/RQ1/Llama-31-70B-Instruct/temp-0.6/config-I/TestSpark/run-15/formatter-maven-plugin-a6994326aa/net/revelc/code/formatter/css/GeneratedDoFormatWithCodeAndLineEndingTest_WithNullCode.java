package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDoFormatWithCodeAndLineEndingTest_WithNullCode {

    @Test
    public void doFormatWithCodeAndLineEndingTest_WithNullCode() {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        LineEnding ending = LineEnding.UNIX;

        // Act
        String result = formatter.doFormat(null, ending);

        // Assert
        assertEquals(null, result);
    }

}