package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

public class GeneratedTest_doFormat_single_rule {

    @Test
    public void test_doFormat_single_rule() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));
        public LineEnding ending = new LineEnding();

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

}