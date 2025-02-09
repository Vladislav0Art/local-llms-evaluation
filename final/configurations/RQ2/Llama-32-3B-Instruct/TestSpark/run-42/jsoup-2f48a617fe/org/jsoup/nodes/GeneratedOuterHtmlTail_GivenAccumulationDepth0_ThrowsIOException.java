package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlTail_GivenAccumulationDepth0_ThrowsIOException {

    @Test
    public void outerHtmlTail_GivenAccumulationDepth0_ThrowsIOException() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getIndentLevel()).thenReturn(depth);
        Comment comment = new Comment("data");
        Comment innerComment = mock(Comment.class);
        when(innerComment.nodeName()).thenReturn("div");
        when(innerComment.getData()).thenReturn("<div>This is a div.</div>");
        CommentElement element = mock(CommentElement.class);
        when(element.toString()).thenReturn("this is a comment.");
        Comment outerComment = new Comment();
        outerComment.setChildren(Arrays.asList(innerComment));
        assertTrue throws IOException(comment.outerHtmlTail(accum, depth, out));
    }

}