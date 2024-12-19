package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("-->")).thenReturn(appendable);
        comment.outerHtmlTail(appendable, 0, null);
        Mockito.verify(appendable).append("-->");
    }

}