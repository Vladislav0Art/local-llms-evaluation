package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedExtractAttributesCommentTagTest {

    @Test
    public void extractAttributesCommentTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("Test Comment");
        xmlTreeBuilder.insert(commentToken);
        Assert.assertEquals("Test Comment", ((Comment) xmlTreeBuilder.getStack().get(1)).getData());
    }

}