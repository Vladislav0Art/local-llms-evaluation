package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        when(comment.outerHtmlHead(any(Appendable.class), any(int.class), any(Document.OutputSettings.class)).thenReturn("", "Test");
        assertEquals("Test", comment.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.OUTPUT_TYPE_HTML));
    }

}