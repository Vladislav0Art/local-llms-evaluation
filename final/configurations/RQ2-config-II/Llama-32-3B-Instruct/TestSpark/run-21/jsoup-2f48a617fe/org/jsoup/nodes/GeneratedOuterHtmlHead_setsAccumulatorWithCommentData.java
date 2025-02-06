package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_setsAccumulatorWithCommentData {

    @Test
    public void outerHtmlHead_setsAccumulatorWithCommentData() throws IOException {
        Comment comment = new Comment("data");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Mockito.verify(accum).append(comment.getData());
    }

}