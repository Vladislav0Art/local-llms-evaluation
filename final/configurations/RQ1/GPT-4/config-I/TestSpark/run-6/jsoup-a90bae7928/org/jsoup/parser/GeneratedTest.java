package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertEquals(ParseSettings.preserveCase, builder.defaultSettings());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("tag");
        Element element = builder.insert(startTag);
        Assert.assertNotNull(element);
    }

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Assert.assertEquals(ParseSettings.preserveCase, treeBuilder.defaultSettings());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("Tove");
        Assert.assertTrue(treeBuilder.process(character));
    }

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.EOF();
        treeBuilder.process(token);
    }

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.EOF();
        Assert.assertFalse(treeBuilder.process(token));
    }

}