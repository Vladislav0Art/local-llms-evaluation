package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void test_init() {
        // Arrange
        public ConfigurationSource cfg = new ConfigurationSource();

        // Act
        public CssFormatter formatter = new CssFormatter();
        boolean initialized = formatter.init(cfg, null);

        // Assert
        assert initialized;
    }

    @Test
    public void test_doFormat() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));
        public LineEnding ending = new LineEnding();

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

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

    @Test
    public void test_doFormat_empty_line() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));
        public LineEnding ending = new LineEnding();

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

    @Test
    public void test_doFormat_empty_line2() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));
        public LineEnding ending = new LineEnding();

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

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

    @Test
    public void test_doFormat_multiple_rules() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));
        public LineEnding ending = new LineEnding();

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

    @Test
    public void test_doFormat_string() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));
        public LineEnding ending = new LineEnding();

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

    @Test
    public void test_doFormat_empty_string() {
        // Arrange
        public InputSource inputSource = new InputSource(new StringReader(""));

        // Act
        public CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(inputSource, ending);

        // Assert
        assert !result.isEmpty();
    }

    @Test
    public void test_doFormat_empty_string2() {
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