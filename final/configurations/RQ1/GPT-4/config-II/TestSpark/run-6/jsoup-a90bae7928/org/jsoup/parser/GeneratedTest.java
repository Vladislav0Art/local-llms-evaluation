package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void newInstanceDefaultTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(xmlTreeBuilder);
        xmlTreeBuilder.initialiseParse(new StringReader("<xml></xml>"), "http://base.com", parser);

        Document.OutputSettings outputSettings = xmlTreeBuilder.getTop().outputSettings();

        assertEquals("Output syntax should be XML", Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals("Output escape mode should be XHTML", Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        assertFalse("Pretty Print should be false", outputSettings.prettyPrint());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("TagName");
        startTag.setSelfClosing();

        Element element = xmlTreeBuilder.insert(startTag);
        assertEquals("TagName", element.nodeName());
    }

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = Mockito.mock(Token.Comment.class);
        Mockito.when(commentToken.getData()).thenReturn("<?xml version=\"1.0\"?>");
        Mockito.when(commentToken.isBogus()).thenReturn(true);

        treeBuilder.insert(commentToken);

        List<Node> nodes = treeBuilder.getTop().childNodes();
        assertEquals(1, nodes.size());

        assertTrue(nodes.get(0) instanceof XmlDeclaration);
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character().data("CharData");

        treeBuilder.insert(characterToken);

        List<Node> nodes = treeBuilder.getTop().childNodes();
        assertEquals(1, nodes.size());

        assertTrue(nodes.get(0) instanceof TextNode);
    }

    @Test
    public void processUnexpectedTypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token();

        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Unexpected token type");
        xmlTreeBuilder.process(token);
    }

}