package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateComment_withData ReturnsCorrectComment {

    @Test
    public void createComment_withData

    ReturnsCorrectComment() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("This is a comment");
        assertThat(comment.getData(), is("This is a comment"));
    }

}