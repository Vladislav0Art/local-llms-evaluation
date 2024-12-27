package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void newInstanceTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertNotNull(builder.newInstance());
    }

    @Test
    public void initialiseParseTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "", parser);
        assertNotNull(builder.getDocument());
    }

    @Test
    public void processTokenTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "", parser);

        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "html";
        assertTrue(builder.process(startTag));
    }

    @Test
    public void getDocumentTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "", parser);
        Document document = builder.getDocument();
        assertNotNull(document);
    }

    @Test
    public void getBaseUriTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "http://example.com", parser);
        assertEquals("http://example.com", builder.getBaseUri());
    }

    @Test
    public void parseFragmentTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.parseFragment("<p>test</p>", null, "", parser);
        Elements elements = builder.getDocument().getElementsByTag("p");
        assertTrue(elements.size() > 0);
    }

    @Test
    public void getStackTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html></html>"), "", parser);
        assertTrue(builder.getStack().size() > 0);
    }

    @Test
    public void removeLastFormattingElementTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element(Tag.valueOf("b"), "");
        builder.pushActiveFormattingElements(element);
        assertNotNull(builder.removeLastFormattingElement());
    }

    @Test
    public void insertFormTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<html><body></body></html>"), "", parser);

        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "form";
        FormElement form = builder.insertForm(startTag, false, true);
        assertNotNull(form);
    }

}