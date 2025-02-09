package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("TestXmlDeclaration");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}