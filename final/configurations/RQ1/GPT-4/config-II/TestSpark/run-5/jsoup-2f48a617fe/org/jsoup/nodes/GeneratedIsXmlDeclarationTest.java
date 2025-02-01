package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment declarationComment = new Comment("!xmlDeclaration");
        Assert.assertTrue(declarationComment.isXmlDeclaration());

        Comment normalComment = new Comment("notXmlDeclaration");
        Assert.assertFalse(normalComment.isXmlDeclaration());
    }

}