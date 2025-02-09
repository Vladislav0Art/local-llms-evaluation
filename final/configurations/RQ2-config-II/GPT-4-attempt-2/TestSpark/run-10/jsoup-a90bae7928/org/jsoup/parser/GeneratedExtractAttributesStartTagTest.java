package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedExtractAttributesStartTagTest {

    @Test
    public void extractAttributesStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.attr("key", "value");
        xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("value", xmlTreeBuilder.getStack().get(1).attr("key"));
    }

}