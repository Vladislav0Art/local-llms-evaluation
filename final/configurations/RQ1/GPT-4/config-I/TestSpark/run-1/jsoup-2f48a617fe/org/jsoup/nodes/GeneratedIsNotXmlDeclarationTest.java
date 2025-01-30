package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedIsNotXmlDeclarationTest {

    @Test
    public void isNotXmlDeclarationTest() {
        String data = "xml version=\"1.0\" encoding=\"UTF-8\"";
        Comment comment = new Comment(data);
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}