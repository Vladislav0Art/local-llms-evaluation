package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_throwsIOException_onIOError {

    @Test
    public void outerHtmlHead_throwsIOException_onIOError() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        try {
            comment.outerHtmlHead(accum, depth, out);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}