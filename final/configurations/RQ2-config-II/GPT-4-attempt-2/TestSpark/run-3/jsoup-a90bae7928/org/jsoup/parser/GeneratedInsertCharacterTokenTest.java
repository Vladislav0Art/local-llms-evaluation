package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCharacterTokenTest {

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Character("hello"));
        Assert.assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}