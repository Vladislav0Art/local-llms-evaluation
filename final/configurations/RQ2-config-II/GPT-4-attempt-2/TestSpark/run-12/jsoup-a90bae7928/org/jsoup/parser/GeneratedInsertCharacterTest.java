package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character().data("data");
        xmlTreeBuilder.insert(character);
        Assert.assertTrue(xmlTreeBuilder.stack.getLast() instanceof TextNode);
    }

}