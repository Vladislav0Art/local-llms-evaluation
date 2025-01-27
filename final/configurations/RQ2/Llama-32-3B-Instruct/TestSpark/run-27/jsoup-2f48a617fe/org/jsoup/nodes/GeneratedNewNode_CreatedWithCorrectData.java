package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedNewNode_CreatedWithCorrectData {

    @Test
    public void newNode_CreatedWithCorrectData() {
        Comment comment = new Comment("some data");
        Mockito.when(comment.getData()).thenReturn("some data");
        assert comment.getData().equals("some data");
    }

}