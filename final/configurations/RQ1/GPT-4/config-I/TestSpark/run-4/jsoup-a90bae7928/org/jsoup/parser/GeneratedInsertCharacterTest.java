package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.getData().append("Test character");
        xmlTreeBuilder.insert(character);
        Assert.assertEquals("Test character", xmlTreeBuilder.currentElement().childNode(0).outerHtml());
    }

}