package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initialiseParse_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse(baseUri, baseUri);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

    @Test
    public void initialiseParse_NullInput_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse(null, baseUri, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

    @Test
    public void initialiseParse_EmptyInput_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse("", baseUri, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

    @Test
    public void initialiseParse

    NullBaseUri_ReturnsDefaultSettings() {
        // Arrange
        String input = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse(input, null, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(input, input);
    }

    @Test
    public void initialiseParse_InvalidBaseUri_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "invalid uri";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse("", baseUri, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

    @Test
    public void initialiseParse_NoParser_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse("", baseUri, null);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

    @Test
    public void process_OnlyToken_ReturnsFalse() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(defaultSettings);

        // Act
        boolean result = xmlTreeBuilder.process(new Token(input));

        // Assert
        Mockito.verifyNoMoreInteractions(parser, defaultSettings);
    }

    @Test
    public void process_OnlyTokenWithComment_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(defaultSettings);

        // Act
        boolean result = xmlTreeBuilder.process(new Token(input, false));

        // Assert
        Mockito.verifyNoMoreInteractions(parser, defaultSettings);
    }

    @Test
    public void insertNode_AmbiguousToken_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Token)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_AmbiguousComment_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Comment)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_AmbiguousCharacter_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Character)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_AmbiguousDoctype_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Doctype)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_AmbiguousPopStackToken_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Token)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_AmbiguousPopStackEndTag_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof EndTag)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_InvalidToken_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, true));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Token)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_InvalidComment_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Comment)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_InvalidCharacter_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Character)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_InvalidDoctype_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Doctype)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_InvalidPopStackToken_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof Token)) {
                return;
            }
        }

        // Assert
    }

    @Test
    public void insertNode_InvalidPopStackEndTag_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        xmlTreeBuilder.insertNode(new Token(input, false));
        List<Node> list = xmlTreeBuilder.parseFragment("", "", parser);
        for (Node node : list) {
            if (!(node instanceof EndTag)) {
                return;
            }
        }

        // Assert
    }

}