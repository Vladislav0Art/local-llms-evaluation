package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_WritesCorrectXml {

    @Test
    public void outerHtmlHead_WritesCorrectXml() throws IOException {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("<!-- This is a test comment -->");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, depth, out);
        assertThat(outContent.toString(), is("<!--This is a test comment-->"));
    }

}