package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_throwsIOError_onIOError {

    @Test
    public void outerHtmlTail_throwsIOError_onIOError() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        try {
            comment.outerHtmlTail(accum, depth, out);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}