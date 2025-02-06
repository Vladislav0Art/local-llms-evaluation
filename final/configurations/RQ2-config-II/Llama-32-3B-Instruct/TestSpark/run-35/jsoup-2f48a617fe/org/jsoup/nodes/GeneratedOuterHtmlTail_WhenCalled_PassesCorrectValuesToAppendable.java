package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_WhenCalled_PassesCorrectValuesToAppendable {

    @Test
    public void outerHtmlTail_WhenCalled_PassesCorrectValuesToAppendable() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        Mockito.verify(accum).append(Mockito.anyString());
    }

}