package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment normalComment = new Comment("test");
        Comment xmlComment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        Assert.assertFalse(normalComment.isXmlDeclaration());
        Assert.assertTrue(xmlComment.isXmlDeclaration());
    }

}