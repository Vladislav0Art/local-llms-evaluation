package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.TreeBuilder;
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
        ParseSettings settings = xmlTreeBuilder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void initialiseParseTest() {
        Reader input = new StringReader("<html></html>");
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        xmlTreeBuilder.initialiseParse(input, baseUri, parser);
    }

    @Test
    public void parseTest() throws Exception {
        Reader input = new StringReader("<html></html>");
        String baseUri = "https://example.com";
        Document document = xmlTreeBuilder.parse(input, baseUri);
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
    public void processTest() {
        Token token = new Token();
        boolean result = xmlTreeBuilder.process(token);
        assertTrue(result);
    }

    @Test
    public void insertNodeTest() {
        Node node = new TextNode("Hello World");
        xmlTreeBuilder.insertNode(node);
    }

    @Test
    public void insertNodeWithTokenTest() {
        Node node = new TextNode("Hello World");
        Token token = new Token();
        xmlTreeBuilder.insertNode(node, token);
    }

}