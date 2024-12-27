package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();

        assertNotNull(parseSettings);
    }

    @Test
    public void newInstanceTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        HtmlTreeBuilder newInstance = htmlTreeBuilder.newInstance();

        assertNotNull(newInstance);
    }

    @Test
    public void initialiseParseTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        StringReader stringReader = new StringReader("testInput");

        htmlTreeBuilder.initialiseParse(stringReader, "baseUri", new Parser(htmlTreeBuilder));
    }

    @Test
    public void parseFragmentTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        List<Node> nodes = htmlTreeBuilder.parseFragment("inputFragment", new Element("test"), "baseUri", new Parser(htmlTreeBuilder));

        assertNotNull(nodes);
    }

    @Test
    public void processTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        boolean result = htmlTreeBuilder.process(new Token.Comment());

        assertTrue(result);
    }

    @Test
    public void transitionTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        HtmlTreeBuilderState originalState = htmlTreeBuilder.state();

        htmlTreeBuilder.transition(HtmlTreeBuilderState.InBody);
        HtmlTreeBuilderState newState = htmlTreeBuilder.state();

        assertNotSame(originalState, newState);
    }

    @Test
    public void getDocumentTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Document document = htmlTreeBuilder.getDocument();

        assertNotNull(document);
    }

    @Test
    public void getBaseUriTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        String baseUri = htmlTreeBuilder.getBaseUri();
        assertNotNull(baseUri);
    }

    @Test
    public void insertStartTagTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Element element = htmlTreeBuilder.insertStartTag("startTagName");

        assertNotNull(element);
    }

    @Test
    public void generateImpliedEndTagsTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        htmlTreeBuilder.insertStartTag("p"); // push p element to stack
        htmlTreeBuilder.generateImpliedEndTags();

        assertNull(htmlTreeBuilder.getFromStack("p")); // p should be popped from stack
    }

    @Test
    public void isSpecialTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Element element = new Element("p");

        boolean isSpecial = htmlTreeBuilder.isSpecial(element);
        assertFalse(isSpecial);   // "p" element is not special
    }

}