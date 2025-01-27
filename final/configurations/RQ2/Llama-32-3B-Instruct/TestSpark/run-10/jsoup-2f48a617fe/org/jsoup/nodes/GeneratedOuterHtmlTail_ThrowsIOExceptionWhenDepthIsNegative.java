package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedOuterHtmlTail_ThrowsIOExceptionWhenDepthIsNegative {

    @Test
    public void outerHtmlTail_ThrowsIOExceptionWhenDepthIsNegative() throws IOException {
        Appable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, -1, out);
        assertThrows(IOException.class, () -> comment.outerHtmlTail(accum, -1, out));
    }

}