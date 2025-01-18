package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings defaultSettings = builder.defaultSettings();
        assertNotNull(defaultSettings);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader stringReader = new StringReader("<html></html>");
        builder.initialiseParse(stringReader, "test", Parser.htmlParser());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader stringReader = new StringReader("<html></html>");
        Document doc = builder.parse(stringReader, "test");
        assertNotNull(doc);
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<html></html>";
        Document doc = builder.parse(input, "test");
        assertNotNull(doc);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = builder.newInstance();
        assertNotNull(newInstance);
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("data");
        boolean processed = builder.process(character);
        assertTrue(processed);
    }

}