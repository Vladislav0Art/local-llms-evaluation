package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("<!--test-->")).thenReturn(appendable);
        comment.outerHtmlHead(appendable, 0, null);
        Mockito.verify(appendable).append("<!--test-->");
    }

}