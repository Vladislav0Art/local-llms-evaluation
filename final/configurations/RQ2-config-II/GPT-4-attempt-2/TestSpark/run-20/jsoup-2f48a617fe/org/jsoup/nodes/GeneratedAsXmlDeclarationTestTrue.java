package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedAsXmlDeclarationTestTrue {

    @Test
    public void asXmlDeclarationTestTrue() {
        Comment comment = new Comment("<?xml version=\"1.0\"?>");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

}