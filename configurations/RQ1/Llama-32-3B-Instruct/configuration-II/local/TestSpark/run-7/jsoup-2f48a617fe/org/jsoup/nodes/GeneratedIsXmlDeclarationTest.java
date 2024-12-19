package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclaration());

        Comment comment2 = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("not xml");
        assertFalse(comment3.isXmlDeclaration());
    }

}