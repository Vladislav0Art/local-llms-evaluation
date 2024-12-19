package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public static class ParseSettings {
        String baseUri = "";
    }

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = (ParseSettings) builder.defaultSettings();
        assertEquals(ParseSettings.class, settings.getClass());
    }

    @Test
    public void testInitializeParse() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        builder.initialiseParse(parser, baseUri);
        Document document = builder.parse();
        assertEquals(baseUri, document.getBaseURI());
    }

    @Test
    public void testProcessToken() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String token = "html";
        Document document = (Document) builder.parse().node(token);
        assertTrue(builder.process(new Token(token)));
        assertFalse(builder.process(new Token("other")));
    }

    @Test
    public void testGetStack() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Document document = (Document) builder.parse();
        assertEquals("", ((HtmlTreeBuilder) document).getStack());
    }

    @Test
    public void testIsFragmentParsing() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "https://example.com";
        String fragmentUri = "fragment-1";
        Document document = (Document) builder.initialiseParse(new Reader(), baseUri).parse().node(fragmentUri);
        assertTrue(document.getBaseURI().equals(baseUri));
    }

    @Test
    public void testGetBaseUri() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String baseUri = "https://example.com";
        Document document = (Document) builder.parse();
        assertEquals(baseUri, document.getBaseURI());
    }

}