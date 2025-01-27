package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedGetData_ReturnsCorrectData {

    @Test
    public void getData_ReturnsCorrectData() {
        Comment comment = new Comment("some data");
        String data = comment.getData();
        assert data.equals("some data");
        Mockito.verifyNoMethodCalls();
    }

}