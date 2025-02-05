package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment xmlDeclerationComment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Comment normalComment = new Comment("this is a comment");

        Assert.assertNotNull(xmlDeclerationComment.asXmlDeclaration());
        Assert.assertNull(normalComment.asXmlDeclaration());
    }

}