package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorHasCorrectData {

    @Test
    public void constructorHasCorrectData() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}