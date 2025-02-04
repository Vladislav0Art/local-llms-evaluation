package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedIsXmlDeclarationTrueTest {

    @Test
    public void isXmlDeclarationTrueTest() {
        String data = "/* This is an XML declaration */";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}