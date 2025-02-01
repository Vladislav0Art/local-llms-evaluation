package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertTrue(comment.isXmlDeclaration());

        Comment notXmlComment = new Comment("test comment");
        Assert.assertFalse(notXmlComment.isXmlDeclaration());
    }

}