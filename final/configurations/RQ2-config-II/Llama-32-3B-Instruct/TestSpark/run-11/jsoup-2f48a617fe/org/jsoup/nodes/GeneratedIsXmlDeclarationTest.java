package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Data");
        assertTrue(comment.isXmlDeclaration());
    }

}