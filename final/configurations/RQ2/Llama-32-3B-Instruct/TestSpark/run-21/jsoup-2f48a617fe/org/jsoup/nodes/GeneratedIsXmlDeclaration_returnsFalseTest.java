package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedIsXmlDeclaration_returnsFalseTest {

    @Test
    public void isXmlDeclaration_returnsFalseTest() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}