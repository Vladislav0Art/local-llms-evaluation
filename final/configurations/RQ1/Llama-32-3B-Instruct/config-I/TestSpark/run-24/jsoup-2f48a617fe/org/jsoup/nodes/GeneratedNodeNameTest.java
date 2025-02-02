package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameTest {

    private static final String DATA = "This is a comment";

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment(DATA);
        assertEquals("#comment", comment.nodeName());
    }

}