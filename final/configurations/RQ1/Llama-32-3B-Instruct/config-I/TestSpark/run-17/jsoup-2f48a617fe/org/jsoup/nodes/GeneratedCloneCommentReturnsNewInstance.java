package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers.*;

@RunWith(JUnit4.class)
public class GeneratedCloneCommentReturnsNewInstance {

    @Test
    public void cloneCommentReturnsNewInstance() {
        Comment comment = new Comment("Hello, World!");
        Comment cloned = comment.clone();
        assertThat(cloned, not(comment));
    }

}