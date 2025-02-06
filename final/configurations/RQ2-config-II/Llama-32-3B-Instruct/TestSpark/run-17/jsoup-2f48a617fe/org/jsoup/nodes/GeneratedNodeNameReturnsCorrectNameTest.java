package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedNodeNameReturnsCorrectNameTest {

    @Test
    public void nodeNameReturnsCorrectNameTest() {
        Comment comment = new Comment("data");
        assertEquals("Comment", comment.nodeName());
    }

}