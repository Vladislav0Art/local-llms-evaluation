package net.revelc.code.formatter.css;

public class GeneratedTest {

    @Test
    public void testInitNoOptions() throws IOException {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        assert Not(formatter.isInitialized());
    }

    @Test
    public void testInitEmptyOptions() throws IOException {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        assert Not(formatter.isInitialized());
    }

    @Test
    public void testInitDefaultOptions() throws IOException {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        assert Is(formatter.isInitialized());
    }

    @Test
    public void testDoFormatEmptyCode() throws IOException {
        // Arrange
        final String code = "";

        // Act
        String result = formatter.doFormat(code, LineEnding.ET);

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatNoError() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.CRLF;

        // Act
        String result = formatter.doFormat(code, ending);

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatError() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatNoSource() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.CRLF;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatEmptySource() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatNoStylesheet() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.CRLF;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatEmptyStylesheet() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatNoStylesheetSource() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatNoStylesheet() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

    @Test
    public void testDoFormatEmptyStylesheet() throws IOException {
        // Arrange
        final String code = "body { color: red; }";
        final LineEnding ending = LineEnding.ET;

        // Act
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }

        // Assert
        assert Not(result.isEmpty());
    }

}