package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

    @Mock
    private Element contextElement;

    @Mock
    private Token commentToken;

    @Mock
    private Token characterToken;

    @Mock
    private Token endTagToken;

    @Test
    public void newInstance_ReturnsElement() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        // Act
        Element element = xmlTreeBuilder.newInstance().insert(contextElement).parse("test");
        // Assert
        assertEquals(element, Mockito.times(1).anyOf(xmlTreeBuilder.newInstance().insert(contextElement)));
    }

    @Test
    public void initialiseParse_ReturnsParserSettings() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getBaseUri()).thenReturn(baseUri);
        // Act
        ParseSettings defaultSettings = xmlTreeBuilder.initialiseParse(new StringReader("test"), baseUri, parser);
        // Assert
        assertEquals(defaultSettings, Mockito.times(1).anyOf(xmlTreeBuilder.initialiseParse(new StringReader("test"), baseUri, parser)));
    }

    @Test
    public void initialiseParse_ReturnsXmlDeclaration() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.getBaseUri()).thenReturn(baseUri);
        // Act
        ParseSettings defaultSettings = xmlTreeBuilder.initialiseParse(new StringReader("test"), baseUri, parser);
        // Assert
        assertEquals(XmlDeclaration.HEADER.toString(), defaultSettings.getXmlDeclaration());
    }

    @Test
    public void parse_ReturnsDocument() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(input)).thenReturn(new Document("test"));
        // Act
        Element element = xmlTreeBuilder.parse(input, "test").insert(contextElement).parse("test");
        // Assert
        assertEquals(element, Mockito.times(1).anyOf(xmlTreeBuilder.parse(input, "test")));
    }

    @Test
    public void parse_ReturnsFragmentList() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(inputFragment)).thenReturn(new List<Node>() {{
            add(new Node("element1"));
            add(new Node("element2"));
        }});
        // Act
        List<Node> fragmentList = xmlTreeBuilder.parseFragment(inputFragment, "test", "test").insert(contextElement).parse("test");
        // Assert
        assertEquals(2, fragmentList.size());
    }

    @Test
    public void parse_ReturnsFragmentToken() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(inputFragment)).thenReturn(new Token[]{new Token("token1"), new Token("token2")});
        // Act
        List<Token> fragmentTokenList = xmlTreeBuilder.parseFragment(inputFragment, "test", "test").insert(contextElement).parse("test");
        // Assert
        assertEquals(2, fragmentTokenList.size());
    }

    @Test
    public void parse_ReturnsFragmentContext() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "test";
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parse(inputFragment)).thenReturn(new Token[]{new Token("token1"), new Token("token2")});
        Element contextElementMock = new Element("test", contextElement);
        Mockito.when(contextElementMock.getName()).thenReturn("test");
        // Act
        List<Node> fragmentList = xmlTreeBuilder.parseFragment(inputFragment, "test", "test").insert(contextElementMock).parse("test");
        // Assert
        assertEquals(2, fragmentList.size());
    }

    @Test
    public void insertToken_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        // Act
        Node node = xmlTreeBuilder.insertToken(token).insert(contextElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertToken(token)));
    }

    @Test
    public void insertNode_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        Element nodeElementMock = new Element("test", null);
        Mockito.when(nodeElementMock.getName()).thenReturn("element1");
        // Act
        Node node = xmlTreeBuilder.insertToken(token).insertNode(nodeElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertNode(token)));
    }

    @Test
    public void insertCommentToken_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        Element nodeElementMock = new Element("test", null);
        Mockito.when(nodeElementMock.getName()).thenReturn("element1");
        // Act
        Node node = xmlTreeBuilder.insertCommentToken(token).insertNode(nodeElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertCommentToken(token)));
    }

    @Test
    public void insertCharacterToken_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        Element nodeElementMock = new Element("test", null);
        Mockito.when(nodeElementMock.getName()).thenReturn("element1");
        // Act
        Node node = xmlTreeBuilder.insertCharacter(token).insertNode(nodeElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertCharacter(token)));
    }

    @Test
    public void insertDoctypeToken_ReturnsNode() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        Element nodeElementMock = new Element("test", null);
        Mockito.when(nodeElementMock.getName()).thenReturn("element1");
        // Act
        Node node = xmlTreeBuilder.insertDoctype(token).insertNode(nodeElementMock).parse("test");
        // Assert
        assertEquals(node, Mockito.times(1).anyOf(xmlTreeBuilder.insertDoctype(token)));
    }

    @Test
    public void popStackToCloseToken_ReturnsEndTagToken() {
        // Arrange
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token("token1");
        Element nodeElementMock = new Element("test", null);
        Mockito.when(nodeElementMock.getName()).thenReturn("element1");
        // Act
        EndTagToken endTagToken = xmlTreeBuilder.popStackToClose(token).insertNode(nodeElementMock).parse("test");
        // Assert
        assertEquals(endTagToken, Mockito.times(1).anyOf(xmlTreeBuilder.popStackToClose(token)));
    }

}