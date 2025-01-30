package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<tag>content</tag>");
        String baseUri = "https://www.example.com";
        Document result = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(result);
        assertEquals("<tag>content</tag>", result.outerHtml());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<tag>content</tag>";
        String baseUri = "https://www.example.com";
        Document result = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(result);
        assertEquals("<tag>content</tag>", result.outerHtml());
    }

    @Test
    public void insertTokenStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse("<root></root>", "");
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("newTag");
        Element result = xmlTreeBuilder.insert(startTag);
        assertEquals("newTag", result.tagName());
    }

    @Test
    public void insertTokenCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse("<root></root>", "");
        Token.Character character = new Token.Character();
        character.data("data");
        xmlTreeBuilder.insert(character);
    }

    @Test
    public void insertTokenEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse("<tag>content</tag>", "");
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tag");
        xmlTreeBuilder.popStackToClose(endTag);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> result = xmlTreeBuilder.parseFragment("<tag>content</tag>", "https://www.example.com", new Parser(xmlTreeBuilder));
        assertNotNull(result);
        assertEquals(1, result.size());
    }

}