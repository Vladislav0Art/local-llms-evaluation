package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("Hello, World!");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}