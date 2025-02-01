package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment commentNode = new Comment("!DOCTYPE html");
        assertNotNull(commentNode.asXmlDeclaration());
        commentNode = new Comment("normal");
        assertNull(commentNode.asXmlDeclaration());
    }

}