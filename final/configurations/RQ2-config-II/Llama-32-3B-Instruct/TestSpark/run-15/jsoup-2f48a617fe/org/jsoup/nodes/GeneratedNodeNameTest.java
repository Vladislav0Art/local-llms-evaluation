package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}