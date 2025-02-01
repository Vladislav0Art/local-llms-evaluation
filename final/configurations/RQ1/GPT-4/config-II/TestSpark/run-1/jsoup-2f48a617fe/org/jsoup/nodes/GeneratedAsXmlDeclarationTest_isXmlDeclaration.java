package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest_isXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_isXmlDeclaration() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertNotNull(comment.asXmlDeclaration());
    }

}