package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenCommentWhenCloneThenReturnsNewCommentWithSameData {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @InjectMocks
    private Comment comment;

    @Test
    public void givenCommentWhenCloneThenReturnsNewCommentWithSameData() {
        Comment newComment = comment.clone();
        String data = newComment.getData();
        String originalData = comment.getData();
        assert data.equals(originalData);
    }

}