package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTailDoesNotAppendAnything {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);
        verify(out).outline();
    }

}