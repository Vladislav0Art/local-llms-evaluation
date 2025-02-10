package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment original = new Comment("<!-- This is a comment -->");
        Comment cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original, cloned);
    }

    private void addComment(Document document, String data) {
        Addable accum = document.add(Comment.class);
        int depth = 0;
        appendTo(document, accum, depth);
        accumulate = accum.toString();
    }

}