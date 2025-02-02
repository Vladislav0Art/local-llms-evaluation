package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCommentElement {

    @Test
    public void testCommentElement() {
        Document doc = new Document();
        Element comment = doc.selectFirst("div");
        assertEquals(null, comment.getData());
    }

}