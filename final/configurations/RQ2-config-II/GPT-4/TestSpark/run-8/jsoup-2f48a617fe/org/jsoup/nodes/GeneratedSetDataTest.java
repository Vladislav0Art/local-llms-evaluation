package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Comment");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}