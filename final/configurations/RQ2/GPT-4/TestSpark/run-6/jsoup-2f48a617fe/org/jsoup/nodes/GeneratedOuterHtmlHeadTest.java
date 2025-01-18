package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, outputSettings);

        assertThat(accum.toString(), is("<!--test-->"));
    }

}