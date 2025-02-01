package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!DOCTYPE html");
        Assert.assertNotNull(comment.asXmlDeclaration());

        Comment comment2 = new Comment("invalid");
        Assert.assertNull(comment2.asXmlDeclaration());
    }

}