package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Data");
        assertEquals("Comment", comment.nodeName());
    }

}