package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Character("Test"));
        Assert.assertEquals("Test", ((TextNode) builder.stack.get(0).childNode(0)).getWholeText());
    }

}