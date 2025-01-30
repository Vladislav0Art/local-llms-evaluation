package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTrueTest {

    @Test
    public void isXmlDeclarationTrueTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

}