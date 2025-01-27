package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.XmlDeclaration;
import org.mockito.Mockito;

public class GeneratedSetData SetsCorrectData {

    @Test
    public void setData

    SetsCorrectData() {
        Comment comment = new Comment("some old data");
        comment.setData("new data");
        String data = comment.getData();
        assert data.equals("new data");
        Mockito.verifyNoMethodCalls();
    }

}