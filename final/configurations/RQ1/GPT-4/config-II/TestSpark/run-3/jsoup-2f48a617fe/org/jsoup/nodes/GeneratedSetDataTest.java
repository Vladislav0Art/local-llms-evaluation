package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment commentNode = new Comment("old data");
        commentNode.setData("new data");
        assertEquals("new data", commentNode.getData());
    }

}