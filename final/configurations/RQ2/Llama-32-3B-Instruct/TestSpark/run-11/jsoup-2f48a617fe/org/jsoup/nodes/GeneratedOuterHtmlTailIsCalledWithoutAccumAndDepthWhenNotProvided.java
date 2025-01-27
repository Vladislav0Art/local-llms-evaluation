package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailIsCalledWithoutAccumAndDepthWhenNotProvided {

    @Test
    public void outerHtmlTailIsCalledWithoutAccumAndDepthWhenNotProvided() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);
    }

}