package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataEmptyStringCloneTest {

    private final Document doc = new Document();

    @Test
    public void dataEmptyStringCloneTest() {
        String data = "";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertEquals(0, cloned.getData().length());
    }

}