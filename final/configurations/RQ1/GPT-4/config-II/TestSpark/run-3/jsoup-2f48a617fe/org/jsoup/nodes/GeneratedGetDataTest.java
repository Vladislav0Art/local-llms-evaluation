package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment commentNode = new Comment("test data");
        assertEquals("test data", commentNode.getData());
    }

}