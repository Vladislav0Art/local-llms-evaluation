package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testDefaultSettings() {
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(defaultSettings, null, parser);
        Document document = xmlTreeBuilder.parse(new StringReader("<root><child>text</child></root>", baseUri));
    }

    @Test
    public void testInitialiseParse() {
        Mockito.mock(Readable, times(1));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        String input = "input";
        String baseUri = "http://example.com";
        Document document = xmlTreeBuilder.parse(input, baseUri);
    }

    @Test
    public void testParse() {
        Element element = createElement("root", new String[]{"attr1", "attr2"}, null);
        Mockito.when(element.getAttributes().get("attr1").getValue()).thenReturn("value1");
        Mockito.when(element.getAttributes().get("attr2").getValue()).thenReturn("value2");
        Document document = new XmlTreeBuilder(new ParseSettings(), element, null).parse(new StringReader("<root><child>text</child></root>", baseUri));
    }

    @Test
    public void testInsertNode() {
        Node node = createNode("node", null);
        Mockito.when(node.getParent().getChildren()).thenReturn(node);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, node, null);
        xmlTreeBuilder.insert(node);
    }

    @Test
    public void testInsertNodeToken() {
        Token token = new Token(Token.Type Comment, "comment", null, null, null, null);
        Mockito.when(token.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insert(token);
    }

    @Test
    public void testInsertNodeCommentToken() {
        Token commentToken = createCommentToken("comment", "text", null, null);
        Mockito.when(commentToken.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insert(commentToken);
    }

    @Test
    public void testInsertNodeCharacterToken() {
        Token token = new Token(Token.Type Character, "char", null, null, null, null);
        Mockito.when(token.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insert(token);
    }

    @Test
    public void testInsertNodeDoctypeToken() {
        Token d = createDoctypeToken("doctype", null, null);
        Mockito.when(d.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insert(d);
    }

    @Test
    public void testInsertEndTag() {
        Token endTag = createEndTag("endTag", null);
        Mockito.when(endTag.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insertToken(endTag);
    }

    @Test
    public void testPopStackToCloseEndTag() {
        Token endTag = createEndTag("endTag", null);
        Mockito.when(endTag.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.popStackToClose(endTag);
    }

    @Test
    public void testPopStackToCloseCommentToken() {
        Token commentToken = createCommentToken("comment", "text", null, null);
        Mockito.when(commentToken.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.popStackToClose(commentToken);
    }

    @Test
    public void testPopStackToCloseDoctypeToken() {
        Token d = createDoctypeToken("doctype", null, null);
        Mockito.when(d.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.popStackToClose(d);
    }

    @Test
    public void testParseFragment() {
        String inputFragment = "input fragment";
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = new ArrayList<>();
        Mockito.when(parser.parse(inputFragment, baseUri)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(new ParseSettings(), null, parser);
        Document document = xmlTreeBuilder.parseFragment(inputFragment, baseUri);
    }

    @Test
    public void testParseFragmentWithElement() {
        Element element = createElement("root", new String[]{"attr1", "attr2"}, null);
        String inputFragment = "<fragment>text</fragment>";
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = new ArrayList<>();
        Mockito.when(parser.parse(inputFragment, baseUri)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(new ParseSettings(), element, parser);
        Document document = xmlTreeBuilder.parseFragment(inputFragment, baseUri);
    }

    private Token createElement(String name, String[] attributes, Node parent) {
        return new Token(Token.Type Tag, name, null, null, attributes, null);
    }

    private Token createCommentToken(String comment, String text, Token... children) {
        return new Token(Token.Type Comment, comment, text, null, children, null);
    }

    private Token createDoctypeToken(String doctype, Node parent) {
        return new Token(Token.Type Doctype, doctype, null, null, null, parent);
    }

    @Test
    public void testInsertFragment() {
        String inputFragment = "<fragment>text</fragment>";
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = new ArrayList<>();
        Mockito.when(parser.parse(inputFragment, baseUri)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(new ParseSettings(), null, parser);
        Document document = xmlTreeBuilder.parseFragment(inputFragment, baseUri);
    }

    private Node createNode(String name, String[] attributes) {
        return new Node(name, attributes, null);
    }

}