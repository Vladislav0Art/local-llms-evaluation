package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        assertNotNull(treeBuilder.defaultSettings());
    }

    @Test
    public void newInstanceTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        assertNotNull(treeBuilder.newInstance());
    }

    @Test
    public void initialiseParseTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<html></html>"), "", new Parser(treeBuilder));
        assertTrue(treeBuilder instanceof HtmlTreeBuilder);
    }

    @Test
    public void processTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Token.StartTag token = new Token.StartTag();
        token.nameAttr("test", new Attributes());
        assertTrue(treeBuilder.process(token));
    }

    @Test
    public void processWithStateTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Token.StartTag token = new Token.StartTag();
        token.nameAttr("test", new Attributes());
        assertTrue(treeBuilder.process(token, HtmlTreeBuilderState.InBody));
    }

    @Test
    public void transitionTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.transition(HtmlTreeBuilderState.Text);
        assertEquals(HtmlTreeBuilderState.Text, treeBuilder.state());
    }

    @Test
    public void framesetOkTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.framesetOk(true);
        assertTrue(treeBuilder.framesetOk());
    }

    @Test
    public void getDocumentTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        assertNotNull(treeBuilder.getDocument());
    }

    @Test
    public void getBaseUriTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<html></html>"), "http://test.com", new Parser(treeBuilder));
        assertEquals("http://test.com", treeBuilder.getBaseUri());
    }

    @Test
    public void isFragmentParsingTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        assertFalse(treeBuilder.isFragmentParsing());
    }

}