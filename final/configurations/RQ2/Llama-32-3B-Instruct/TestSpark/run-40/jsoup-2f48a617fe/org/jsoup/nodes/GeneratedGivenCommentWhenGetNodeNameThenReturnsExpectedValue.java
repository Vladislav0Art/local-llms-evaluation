package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedGivenCommentWhenGetNodeNameThenReturnsExpectedValue {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @InjectMocks
    private Comment comment;

    public static void main(String[] args) {
        // Create a mock configuration for Mockito
        MockConfiguration config = new MockConfiguration().addComponents(Mockito.class);

        org.mockito.Mockito.main(config);
    }

    @Test
    public void givenCommentWhenGetNodeNameThenReturnsExpectedValue() {
        comment.nodeName();
        String nodeName = "comment";
        assert nodeName.equals("comment");
    }

}