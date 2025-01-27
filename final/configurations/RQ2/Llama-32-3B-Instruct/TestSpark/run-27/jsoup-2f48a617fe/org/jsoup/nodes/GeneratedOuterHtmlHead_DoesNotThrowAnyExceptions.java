package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_DoesNotThrowAnyExceptions {

    @Test
    public void outerHtmlHead_DoesNotThrowAnyExceptions() throws IOException {
        Appendable accum = new StringBuilder(); // mock implementation for append
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("some data");
        comment.outerHtmlHead(accum, depth, out);
        assert !Mockito.anyError().isThrownBy(() -> comment.outerHtmlHead(accum, depth, out));
    }

}