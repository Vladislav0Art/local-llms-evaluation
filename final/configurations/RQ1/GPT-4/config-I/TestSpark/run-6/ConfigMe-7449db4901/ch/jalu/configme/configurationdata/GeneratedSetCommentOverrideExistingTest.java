package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedSetCommentOverrideExistingTest {

    @Test
    public void setCommentOverrideExistingTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        String comment1 = "Line 1";

        // when
        commentsConfiguration.setComment(path, comment1);
        String comment2 = "Line 2";
        commentsConfiguration.setComment(path, comment2);

        // then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.size(), is(1));
        assertThat(allComments.get(path), is(Arrays.asList(comment2)));
    }

}