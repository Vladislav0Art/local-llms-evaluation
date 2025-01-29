package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testParseEmptyInput() {
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertEquals(null, document);
    }

    @Test
    public void testParseSimpleXml() throws Exception {
        String inputString = "<root><a/></root>";
        String baseUri = "";
        Reader reader = new StringReader(inputString);
        Document document = new XmlTreeBuilder().parse(reader, baseUri);
        assertNotNull(document);
    }

    @Test
    public void testInsertNode() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag, "a")));
        assertEquals("a", ((Token) ((Element) rootElement).getElementsByTagName("a").item(0)).text());
    }

    @Test
    public void testInsertNodeNoText() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag));
        assertEquals(1, ((Element) rootElement).getElementsByTagName("a").item(0).children().size());
    }

    @Test
    public void testInsertNodeNoTags() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag));
        assertEquals(null, ((Element) rootElement).getElementsByTagName("a").item(0).children());
    }

    @Test
    public void testInsertTokenComment() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.Comment, "This is a comment")));
        assertEquals("This is a comment", ((Element) ((Node) rootElement).getElementsByTagName("comment").item(0)).text());
    }

    @Test
    public void testInsertTokenCharacter() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.Character, "a")));
        assertEquals("a", ((Element) ((Node) rootElement).getElementsByTagName("a").item(0)).text());
    }

    @Test
    public void testInsertTokenDoctype() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.Doctype, "DOCTYPE"));
        assertEquals("DOCTYPE", ((Element) ((Node) rootElement).getElementsByTagName("doctype").item(0)).text());
    }

    @Test
    public void testInsertTokenEndTag() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.EndTag, "root"));
        assertEquals("<root>", ((Element) ((Node) rootElement).getElementsByTagName("root").item(0)).text());
    }

    @Test
    public void testInsertTokenStartTag() {
        Element rootElement = new XmlTreeBuilder().newDocumentElement();
        new XmlTreeBuilder().insert(rootElement, new Token(Token.StartTag, "a"));
        assertEquals("<a>", ((Element) ((Node) rootElement).getElementsByTagName("a").item(0)).text());
    }

    @Test
    public void testParseFragment() throws Exception {
        String inputString = "<fragment><a></a></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(1, nodes.size());
    }

    @Test
    public void testParseFragmentNoTags() throws Exception {
        String inputString = "<fragment></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(null, nodes);
    }

    @Test
    public void testParseFragmentNoText() throws Exception {
        String inputString = "<fragment><a></a></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(1, nodes.size());
    }

    @Test
    public void testParseFragmentComment() throws Exception {
        String inputString = "<fragment><a></a></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(null, nodes);
    }

    @Test
    public void testParseFragmentDoctype() throws Exception {
        String inputString = "<fragment><a></a></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(null, nodes);
    }

    @Test
    public void testParseFragmentStartTag() throws Exception {
        String inputString = "<fragment><a></a></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(1, nodes.size());
    }

}