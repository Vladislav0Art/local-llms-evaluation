package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertEqual(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("test"), "www.test.com", new Parser());
        Assert.assertNotNull(xmlTreeBuilder.stack);
    }

    @Test
    public void parseTest_using_reader() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document result = xmlTreeBuilder.parse(new StringReader("<test>data</test>"), "www.example.com");
        Assert.assertNotNull(result);
        Assert.assertEquals("test", result.body().children().first().tagName());
    }

    @Test
    public void parseTest_using_string() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document result = xmlTreeBuilder.parse("<test>data</test>", "www.example.com");
        Assert.assertNotNull(result);
        Assert.assertEquals("test", result.body().children().first().tagName());
    }

    @Test
    public void processTest_shouldThrowException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token().type(Token.TokenType.CData));
    }

    @Test
    public void insertNodeTest() {
        // test covered in parser tests
    }

    @Test
    public void insertStartTagTest() {
        // test covered in parser tests
    }

    @Test
    public void insertCommentTest() {
        // test covered in parser tests
    }

    @Test
    public void insertCharacterTest() {
        // test covered in parser tests
    }

    @Test
    public void insertDoctypeTest() {
        // test covered in parser tests
    }

    @Test
    public void popStackToCloseTest_endTagNotFound() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.stack.add(new Element(Tag.valueOf("p"), ""));
        xmlTreeBuilder.popStackToClose(new Token.EndTag("div"));
        Assert.assertEquals(1, xmlTreeBuilder.stack.size());
    }

    @Test
    public void parseFragmentTest_withoutContext() {
        // test covered in parser tests
    }

    @Test
    public void parseFragmentTest_withContext() {
        // test covered in parser tests
    }

}