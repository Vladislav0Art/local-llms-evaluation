package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTestGetContent {

    public Comment(String data) {
        this.data = data;
    }

    private String data;

    @Test
    public void testGetContent() {
        String content = new Comment(data).getContent();
        assertEquals(data, content);
    }

}