package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        String COMMENT_DATA = "This is a test comment";
        Comment comment = new Comment(COMMENT_DATA);
        when(comment.outerHtmlTail(any(Appendable.class), any(int.class), any(Document.OutputSettings.class)).thenReturn("", "Test");
        assertEquals("Test", comment.outerHtmlTail(new Appendable(), 1, Document.OutputSettings.OUTPUT_TYPE_HTML));
    }

}