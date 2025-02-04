package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationMethodFailsForEmptyDataTest {

    @Test
    public void isXmlDeclarationMethodFailsForEmptyDataTest() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}