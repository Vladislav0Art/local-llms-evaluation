package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithoutContext() {
        Document document = xmlTreeBuilder.parse(new StringReader("<root></root>"));
        assertNotNull(document);
        assertEquals("root", document.body().text());
    }

    @Test
    public void testParse_WithContext() {
        Element root = xmlTreeBuilder.newInstance();
        Document document = xmlTreeBuilder.parse(root, "http://example.com/baseuri");
        assertTrue(document instanceof Document);
    }

    @Test
    public void testParse_WithCommentToken() {
        xmlTreeBuilder.insert(new Comment("<!DOCTYPE html><body></body>"));
        xmlTreeBuilder.insert(new Comment("<!-- comment -->"));
        String input = "<html><head></head><body></body></html>";
        Document document = xmlTreeBuilder.parse(input);
        assertTrue(document.body().text().contains("<!-- comment -->"));
    }

    @Test
    public void testParse_WithCharacterToken() {
        Element element = new Element("div");
        element.text("Hello, World!");
        Document document = xmlTreeBuilder.parse(element, "http://example.com/baseuri");
        assertEquals("Hello, World!", document.body().text());
    }

    @Test
    public void testParse_WithDoctypeToken() {
        xmlTreeBuilder.insert(new TokenDoctype("<!DOCTYPE html><html></html>"));
        Document document = xmlTreeBuilder.parse("http://example.com/baseuri");
        assertEquals("<!DOCTYPE html><html></html>", document.body().text());
    }

    @Test
    public void testParse_WithEndTagToken() {
        xmlTreeBuilder.insert(new TokenEndTag("<\\/body>"));
        String inputFragment = "<html><head></head><body></body>";
        List<Node> list = xmlTreeBuilder.parseFragment(inputFragment, "http://example.com/baseuri", null);
        assertEquals(1, list.size());
    }

    @Test
    public void testParse_WithToken() {
        Document document = xmlTreeBuilder.parse("http://example.com/baseuri");
        assertNotNull(document);
        assertTrue(document instanceof Document);
        Element element = (Element) document.body();
        assertTrue(element.text().contains("<!DOCTYPE html><html></html>"));
    }

    @Test
    public void testParseFragmentWithoutContext() {
        String inputFragment = "<body>";
        List<Node> list = xmlTreeBuilder.parseFragment(inputFragment, "http://example.com/baseuri", null);
        assertEquals(1, list.size());
    }

    @Test
    public void testParseFragmentWithContext() {
        Element root = new Element("div");
        Document document = xmlTreeBuilder.newInstance();
        xmlTreeBuilder.insert(root);
        xmlTreeBuilder.insert(new TokenComment("<!-- comment -->"));
        String inputFragment = "<body>";
        List<Node> list = xmlTreeBuilder.parseFragment(inputFragment, "http://example.com/baseuri", document);
        assertEquals(1, list.size());
    }

}