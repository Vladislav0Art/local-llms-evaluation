package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertNotNull(builder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag></tag>");
        builder.initialiseParse(input, "", Parser.xmlParser());
        assertTrue(builder instanceof XmlTreeBuilder);
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag></tag>");
        Document document = builder.parse(input, "");
        assertNotNull(document);
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<tag></tag>", "");
        assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertNotNull(builder.newInstance());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertTrue(builder.process(new Token()));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(new Token.StartTag());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.StartTag());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Comment());
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Character());
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Doctype());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List nodes = builder.parseFragment("<tag></tag>", "", Parser.xmlParser());
        assertNotNull(nodes);
    }

}