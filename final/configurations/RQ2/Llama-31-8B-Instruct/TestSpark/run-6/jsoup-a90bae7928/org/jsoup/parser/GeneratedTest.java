package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void defaultSettingsTest() {
        ParseSettings parseSettings = xmlTreeBuilder.defaultSettings();
        assertNotNull(parseSettings);
    }

    @Test
    public void initialiseParseTest() {
        Reader reader = new StringReader("<html></html>");
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        xmlTreeBuilder.initialiseParse(reader, baseUri, parser);
    }

    @Test
    public void parseTest() throws Exception {
        Reader reader = new StringReader("<html></html>");
        String baseUri = "https://example.com";
        Document document = xmlTreeBuilder.parse(reader, baseUri);
        assertNotNull(document);
    }

    @Test
    public void parseStringTest() throws Exception {
        String input = "<html></html>";
        String baseUri = "https://example.com";
        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
    }

    @Test
    public void processTokenTest() {
        Token token = new Token.TokenType();
        boolean result = xmlTreeBuilder.process(token);
        assertTrue(result);
    }

    @Test
    public void insertNodeTest() {
        Node node = new TextNode("text");
        xmlTreeBuilder.insertNode(node);
    }

    @Test
    public void insertNodeWithTokenTest() {
        Node node = new TextNode("text");
        Token token = new Token.TokenType();
        xmlTreeBuilder.insertNode(node, token);
    }

}