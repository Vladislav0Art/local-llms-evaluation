package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCommentTokenTest {

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Comment("hello"));
        Assert.assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}