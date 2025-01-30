package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

public class GeneratedAsXmlDeclarationNullTest {

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("Sample Comment");
        assertNull(comment.asXmlDeclaration());
    }

}