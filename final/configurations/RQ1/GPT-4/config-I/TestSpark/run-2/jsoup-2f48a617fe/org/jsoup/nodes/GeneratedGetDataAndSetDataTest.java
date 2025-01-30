package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedGetDataAndSetDataTest {

    @Test
    public void getDataAndSetDataTest() {
        Comment comment = new Comment("Test Comment");
        assertEquals("Test Comment", comment.getData());
        comment.setData("New Test Comment");
        assertEquals("New Test Comment", comment.getData());
    }

}