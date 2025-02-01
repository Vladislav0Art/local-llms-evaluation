package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
        Assert.assertTrue(comment.isXmlDeclaration());

        Comment notXmlComment = new Comment("test comment");
        XmlDeclaration notXmlDeclaration = notXmlComment.asXmlDeclaration();
        Assert.assertNull(notXmlDeclaration);
    }

}