package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserDelegate;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws Exception {
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings parseSettings = Mockito.mock(ParseSettings.class);
        ParserDelegate delegate = Mockito.mock(ParserDelegate.class);

        when(parser.parseSettings()).thenReturn(parseSettings);
        when(delegate.parse()).thenReturn(true);

        Comment comment = new Comment("test");

        comment.outerHtmlTail(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class));
        assertEquals(comment, Mockito.verify(parser).parseSettings().lastNode());
    }

}