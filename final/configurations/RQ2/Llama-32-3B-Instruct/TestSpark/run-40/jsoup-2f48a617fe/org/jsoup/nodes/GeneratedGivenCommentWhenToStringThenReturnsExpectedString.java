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

public class GeneratedGivenCommentWhenToStringThenReturnsExpectedString {

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
    public void givenCommentWhenToStringThenReturnsExpectedString() {
        comment.setData("Hello World");
        String toString = comment.toString();
        assert toString.contains("<span>Hello World</span>");
    }

}