package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationWithoutDataTest {

    private static final String DATA = "This is a comment";

    @Test
    public void isXmlDeclarationWithoutDataTest() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}