package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationTest {

    private static final String DATA = "This is a comment";

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment(DATA);
        assertTrue(comment.isXmlDeclaration());
    }

}