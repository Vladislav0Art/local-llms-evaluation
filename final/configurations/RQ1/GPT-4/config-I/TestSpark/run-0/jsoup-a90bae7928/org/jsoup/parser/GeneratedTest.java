package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<doc><element /></doc>");
        String baseUri = "http://example.com";

        Document document = xmlTreeBuilder.parse(input, baseUri);

        assertNotNull(document);
        assertEquals(1, document.childNodeSize());
        assertEquals("doc", document.childNode(0).nodeName());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<doc><element /></doc>";
        String baseUri = "http://example.com";

        Document document = xmlTreeBuilder.parse(input, baseUri);

        assertNotNull(document);
        assertEquals(1, document.childNodeSize());
        assertEquals("doc", document.childNode(0).nodeName());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<fragment><element /></fragment>";
        String baseUri = "http://example.com/";

        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, baseUri, Parser.xmlParser());

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("fragment", nodes.get(0).nodeName());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<fragment><element /></fragment>";
        Element context = new Element(Tag.valueOf("context"), "");
        String baseUri = "http://example.com/";

        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, baseUri, Parser.xmlParser());

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("fragment", nodes.get(0).nodeName());
    }

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<doc><element /></doc>";
        String baseUri = "http://example.com";

        Document document = xmlTreeBuilder.parse(input, baseUri);

        assertNotNull(document);
    }

    @Test
    public void initialiseParseTest() throws Exception {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "http://example.com";
        String input = "<doc><element /></doc>";
        Method method = TreeBuilder.class.getDeclaredMethod("initialiseParse", StringReader.class, String.class, Parser.class);
        method.setAccessible(true);

        method.invoke(xmlTreeBuilder, new StringReader(input), baseUri, Parser.xmlParser());

        assertEquals(1, xmlTreeBuilder.stack.size());
    }

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<doc><element /></doc>";
        String baseUri = "http://example.com";

        Document document = xmlTreeBuilder.parse(input, baseUri);

        assertNotNull(document);
        assertEquals("doc", document.child(0).tagName());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<doc><element /></doc>";
        String baseUri = "http://example.com";

        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(document);
        assertEquals(1, document.childNodeSize());
        assertEquals("doc", document.childNode(0).nodeName());
    }

}