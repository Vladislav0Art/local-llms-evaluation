package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetData ReturnsCorrectData {

    @Test
    public void getData

    ReturnsCorrectData() {
        Comment comment = new Comment("<!-- Some XML Declaration -->");
        assertEquals("<!-- Some XML Declaration -->", comment.getData());
    }

}