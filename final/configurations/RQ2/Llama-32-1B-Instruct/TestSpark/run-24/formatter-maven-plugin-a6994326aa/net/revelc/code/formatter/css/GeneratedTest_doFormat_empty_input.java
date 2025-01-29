package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

public class GeneratedTest_doFormat_empty_input {

    @Test
    public void test_doFormat_empty_input() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

}