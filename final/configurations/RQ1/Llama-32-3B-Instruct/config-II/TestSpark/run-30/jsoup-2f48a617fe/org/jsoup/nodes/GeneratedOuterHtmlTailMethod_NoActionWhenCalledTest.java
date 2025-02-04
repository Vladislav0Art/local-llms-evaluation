package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTailMethod_NoActionWhenCalledTest {

    @Test
    public void outerHtmlTailMethod_NoActionWhenCalledTest() {
        Document document = Mockito.mock(Document.class);
        Appendable appendable = Mockito.mock(Appendable.class);
        int depth = 0;
        Comment comment = new Comment("This is a test");
        comment.outerHtmlTail(appendable, depth, document.OutputSettings.Builder().build());
    }

}