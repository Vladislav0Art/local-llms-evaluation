package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_DoesNotThrowAnyExceptions {

    @Test
    public void outerHtmlTail_DoesNotThrowAnyExceptions() {
        Appendable accum = new StringBuilder(); // mock implementation for append
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("some data");
        comment.outerHtmlTail(accum, depth, out);
        assert !Mockito.anyError().isThrownBy(() -> comment.outerHtmlTail(accum, depth, out));
    }

}