package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        @Nullable
        Comment.XmlDeclaration result = comment.asXmlDeclaration();
        assertNotNull(result);
    }

}