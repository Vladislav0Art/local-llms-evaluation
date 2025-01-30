package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment1 = new Comment("Clone Test");
        Comment comment2 = comment1.clone();
        assertEquals(comment1.getData(), comment2.getData());
    }

}