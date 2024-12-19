package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment1 = new Comment("");
        Comment comment2 = comment1.clone();
        assertSame(comment1, comment2);
    }

}