package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedSetData_setsDataCorrectlyTest {

    @Test
    public void setData_setsDataCorrectlyTest() {
        Comment comment = new Comment("");
        comment.setData("test");
        assertEquals("test", comment.getData());
    }

}