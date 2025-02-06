package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedConstructorHasCorrectDataTest {

    @Test
    public void constructorHasCorrectDataTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}