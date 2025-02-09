package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("Test Character");
        Assert.assertTrue(xmlTreeBuilder.process(characterToken));
    }

}