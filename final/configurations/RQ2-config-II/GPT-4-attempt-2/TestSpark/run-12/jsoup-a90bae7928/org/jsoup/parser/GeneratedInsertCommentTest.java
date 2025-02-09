package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment comment = new Token.Comment();
        comment.setData("test comment");
        xmlTreeBuilder.insert(comment);
        Assert.assertTrue(xmlTreeBuilder.stack.getLast() instanceof Comment);
    }

}