package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadAddsCommentToHTML {

    @Test
    public void OuterHtmlHeadAddsCommentToHTML() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertThat(accum.toString(), is("<COMMENT data=\"data\"></COMMENT>"));
    }

}