package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class GeneratedInsertCDataTest {

    @Test
    public void insertCDataTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.append("Test CData");
        character.cdata();
        xmlTreeBuilder.insert(character);
        Assert.assertEquals("Test CData", xmlTreeBuilder.currentElement().childNode(0).toString());
    }

}