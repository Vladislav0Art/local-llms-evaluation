package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // Test adding new comments
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        assertThat(commentsConfiguration.getAllComments().get("path1"), is(Arrays.asList("comment1", "comment2")));

        // Test updating existing comments
        commentsConfiguration.setComment("path1", "new_comment1", "new_comment2");
        assertThat(commentsConfiguration.getAllComments().get("path1"), is(Arrays.asList("new_comment1", "new_comment2")));
    }

}