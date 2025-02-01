package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment1 = new Comment("!?data");
        Comment comment2 = new Comment("!data");
        Comment comment3 = new Comment("?data");
        Comment comment4 = new Comment("data");

        Assert.assertFalse(comment1.isXmlDeclaration());
        Assert.assertTrue(comment2.isXmlDeclaration());
        Assert.assertTrue(comment3.isXmlDeclaration());
        Assert.assertFalse(comment4.isXmlDeclaration());
    }

}