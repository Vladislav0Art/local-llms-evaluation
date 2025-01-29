package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest_doFormat_InvalidInput {

    @Test
    public void test_doFormat_InvalidInput() {
        // Arrange
        InputSource inputSource = new InputSource(new StringReader(""));
        LineEnding ending = new LineEnding();

        // Act
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

}