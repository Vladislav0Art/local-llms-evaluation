package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedExtractAttributesCharacterTagTest {

    @Test
    public void extractAttributesCharacterTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("Test Character");
        xmlTreeBuilder.insert(characterToken);
        Assert.assertEquals("Test Character", ((TextNode) xmlTreeBuilder.getStack().get(1)).getWholeText());
    }

}