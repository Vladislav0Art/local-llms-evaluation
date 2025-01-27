package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedNodeName_ReturnsNodeName {

    @Test
    public void nodeName_ReturnsNodeName() {
        Comment comment = new Comment("some data");
        comment.nodeName();
        Mockito.verifyNoMethodCalls();
    }

}