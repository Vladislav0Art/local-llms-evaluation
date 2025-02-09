package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Comment("Test comment"));
        Assert.assertEquals("Test comment", builder.stack.get(0).childNode(0).outerHtml());
    }

}