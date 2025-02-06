package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneResultEqualsOriginalTest {

    private final Document doc = new Document();

    @Test
    public void cloneResultEqualsOriginalTest() throws IOException {
        String data = "<data>Hello</data>";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertEquals(data, cloned.getData());
    }

}