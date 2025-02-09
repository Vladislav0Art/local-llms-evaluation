package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedAsXmlDeclarationTestFalse {

    @Test
    public void asXmlDeclarationTestFalse() {
        Comment comment = new Comment("This is not an XML declaration");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}