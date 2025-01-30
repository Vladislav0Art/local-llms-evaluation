package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test.path";
        String comment1 = "Line 1";
        String comment2 = "Line 2";

        // when
        commentsConfiguration.setComment(path, comment1, comment2);

        // then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertThat(allComments.size(), is(1));
        assertThat(allComments.get(path), is(Arrays.asList(comment1, comment2)));
    }

}