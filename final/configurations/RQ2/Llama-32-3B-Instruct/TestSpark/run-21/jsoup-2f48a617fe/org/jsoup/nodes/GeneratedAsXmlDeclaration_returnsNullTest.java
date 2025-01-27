package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedAsXmlDeclaration_returnsNullTest {

    @Test
    public void asXmlDeclaration_returnsNullTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}