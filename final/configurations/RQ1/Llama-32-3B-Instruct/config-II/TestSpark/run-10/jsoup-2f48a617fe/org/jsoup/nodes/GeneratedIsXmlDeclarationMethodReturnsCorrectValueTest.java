package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationMethodReturnsCorrectValueTest {

    @Test
    public void isXmlDeclarationMethodReturnsCorrectValueTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}