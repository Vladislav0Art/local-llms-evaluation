package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTail_appendsToAccum {

    @Test
    public void outerHtmlTail_appendsToAccum() throws IOException {
        Appendable accum = mock(Appendable.class);
        Comment comment = new Comment("data");
        Document document = mock(Document.class);
        Parser parser = mock(Parser.class);

        when(parser.parse(document, comment, ParseSettings.DEFAULT)).thenReturn(document);
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        verify(accum).append(anyString());
    }

}