package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedOuterHtmlHeadWithDepth1AndOutSettingsTest {

    @Test
    public void outerHtmlHeadWithDepth1AndOutSettingsTest() throws IOException {
        ArrayList<String> accum = new ArrayList<>();
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable appendable = mock(Appendable.class);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 1, out);
        verify(appendable).append("<!-- data -->\n\n");
    }

}