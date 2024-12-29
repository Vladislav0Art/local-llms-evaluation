package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> testComments = new HashMap<>();
        testComments.put("path5", Arrays.asList("old comment1", "old comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(testComments);
        commentsConfiguration.setComment("path5", "new comment");

        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path5").size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path5").get(0), is("new comment"));
    }

}