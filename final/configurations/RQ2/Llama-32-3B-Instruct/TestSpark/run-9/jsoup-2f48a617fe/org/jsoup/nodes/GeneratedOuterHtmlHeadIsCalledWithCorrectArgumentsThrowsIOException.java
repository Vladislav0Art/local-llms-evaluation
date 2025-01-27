package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadIsCalledWithCorrectArgumentsThrowsIOException {

    @Test
    public void outerHtmlHeadIsCalledWithCorrectArgumentsThrowsIOException() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        try {
            comment.outerHtmlHead(accum, depth, out);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
        }
        verify(accum).append(anyString());
    }

}