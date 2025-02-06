package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Document document = new Document();
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        OutputSettings out = new OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        // assertion code here
    }

}