package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void IsXmlDeclarationTest() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.isXmlDeclaration());
    }

}