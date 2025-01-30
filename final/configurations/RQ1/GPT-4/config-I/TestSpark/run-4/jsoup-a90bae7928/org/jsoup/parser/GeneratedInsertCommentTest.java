package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");
        xmlTreeBuilder.insert(comment);
        Assert.assertEquals("<!--comment-->", xmlTreeBuilder.currentElement().childNode(0).outerHtml());
    }

}