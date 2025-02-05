package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment xmlDeclerationComment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Comment normalComment = new Comment("this is a comment");

        assertTrue(xmlDeclerationComment.isXmlDeclaration());
        Assert.assertFalse(normalComment.isXmlDeclaration());
    }

}