package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest_notXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_notXmlDeclaration() {
        Comment comment = new Comment("Test comment");
        assertNull(comment.asXmlDeclaration());
    }

}