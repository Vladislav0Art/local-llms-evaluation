package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("test");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append(Mockito.anyString())).thenReturn(appendable);
        comment.outerHtmlHead(appendable, 1, null);
        Mockito.verify(appendable).append("<!--test-->");
    }

}