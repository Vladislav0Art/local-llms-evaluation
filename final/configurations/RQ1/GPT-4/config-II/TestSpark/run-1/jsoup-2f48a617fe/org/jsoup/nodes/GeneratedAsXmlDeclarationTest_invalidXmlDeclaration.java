package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest_invalidXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_invalidXmlDeclaration() {
        Comment comment = new Comment("!xml somerandomtext");
        assertNull(comment.asXmlDeclaration());
    }

}