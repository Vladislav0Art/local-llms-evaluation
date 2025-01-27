package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedToString_ReturnsCorrectString {

    @Test
    public void toString_ReturnsCorrectString() {
        Comment comment = new Comment("some data");
        String toString = comment.toString();
        assert toString.equals(comment.getData());
        Mockito.verifyNoMethodCalls();
    }

}