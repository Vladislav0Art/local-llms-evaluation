package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?");
        assertTrue(comment.isXmlDeclaration());
    }

}