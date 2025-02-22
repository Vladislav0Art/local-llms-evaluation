package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("Hello, World!");
        assertEquals("Hello, World!", comment.getData());
    }

}