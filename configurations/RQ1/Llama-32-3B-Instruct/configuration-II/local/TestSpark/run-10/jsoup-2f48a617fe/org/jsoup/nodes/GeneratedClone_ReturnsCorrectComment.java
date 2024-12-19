package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_ReturnsCorrectComment {

    @Test
    public void clone_ReturnsCorrectComment() {
        // [MethodUnderTest][Scenario]Test
        Comment comment = new Comment("This is a test comment");
        Comment clonedComment = comment.clone();
        assertThat(clonedComment.getData(), is(comment.getData()));
    }

}