package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Comment data");
        assertEquals("Comment data", comment.getData());
    }

}