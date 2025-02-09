package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        builder.initialiseParse(new StringReader("<html></html>"), "http://example.com", parser);
        // verify the state of builder if possible
    }

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<html></html>"), "http://example.com");
        assertNotNull(document);
    }

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<html></html>", "http://example.com");
        assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = builder.newInstance();
        assertNotNull(newInstance);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token.StartTag();
        token.tagName("html");
        assertTrue(builder.process(token));
    }

    @Test
    public void insertNodeTest() {
        // Not testable in isolation as method under test has private access
        // Need to test in integration with public/protected methods
    }

    @Test
    public void insertStartTagTest() {
        // Not testable in isolation as method under test has private access
        // Need to test in integration with public/protected methods
    }

    @Test
    public void insertCommentTest() {
        // Not testable in isolation as method under test has private access
        // Need to test in integration with public/protected methods
    }

    @Test
    public void insertCharacterTest() {
        // Not testable in isolation as method under test has private access
        // Need to test in integration with public/protected methods
    }

    @Test
    public void insertDoctypeTest() {
        // Not testable in isolation as method under test has private access
        // Need to test in integration with public/protected methods
    }

    @Test
    public void parseFragmentInputBaseUriParserTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        List nodes = builder.parseFragment("<html></html>", "http://example.com", parser);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void parseFragmentInputContextBaseUriParserTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        Document document = builder.parse("<html><body></body></html>", "http://example.com");
        List nodes = builder.parseFragment("<p>Paragraph</p>", document.body(), "http://example.com", parser);
        assertFalse(nodes.isEmpty());
    }

}