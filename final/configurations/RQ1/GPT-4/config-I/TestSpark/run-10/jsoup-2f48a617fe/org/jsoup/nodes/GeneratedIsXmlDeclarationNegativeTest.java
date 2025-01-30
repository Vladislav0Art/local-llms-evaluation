package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationNegativeTest {

    @Test
    public void isXmlDeclarationNegativeTest() {
        Comment comment = new Comment("Not XML comment");
        assertFalse(comment.isXmlDeclaration());
    }

}