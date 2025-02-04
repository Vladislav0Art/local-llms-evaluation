package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameMethodReturnsCorrectValueTest {

    @Test
    public void nodeNameMethodReturnsCorrectValueTest() {
        Comment comment = new Comment("This is a test");
        assertEquals("#comment", comment.nodeName());
    }

}