package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "example.path";
        String commentLine1 = "Example comment 1";
        String commentLine2 = "Example comment 2";

        commentsConfiguration.setComment(path, commentLine1, commentLine2);

        assertThat(commentsConfiguration.getAllComments().get(path), is(Arrays.asList(commentLine1, commentLine2)));
    }

}