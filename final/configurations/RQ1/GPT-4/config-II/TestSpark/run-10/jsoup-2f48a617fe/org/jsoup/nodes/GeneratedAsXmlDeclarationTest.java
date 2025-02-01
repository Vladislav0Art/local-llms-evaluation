package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01//EN' 'http://www.w3.org/TR/html4/strict.dtd'");
        assertNotNull(comment.asXmlDeclaration());
        Comment comment2 = new Comment("?Test");
        assertNull(comment2.asXmlDeclaration());
    }

}