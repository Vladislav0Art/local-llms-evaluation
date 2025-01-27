package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedOuterHtmlTailWithDepth0AndOutSettingsTest {

    @Test
    public void outerHtmlTailWithDepth0AndOutSettingsTest() {
        ArrayList<String> accum = new ArrayList<>();
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable appendable = mock(Appendable.class);
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, out);
        verify(appendable).append("<!-- data -->\n\n");
    }

}