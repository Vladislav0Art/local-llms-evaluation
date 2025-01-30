package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTest {

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

    @Test
    public void getAllCommentsWhenIsEmptyTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // when
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // then
        assertThat(allComments.size(), is(0));
    }

    @Test
    public void getAllCommentsWhenHasCommentsTest() {
        // given
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test.path";
        List<String> commentLines = Arrays.asList("Line 1", "Line 2");
        commentsMap.put(path, commentLines);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);

        // when
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // then
        assertThat(allComments.size(), is(1));
        assertThat(allComments.keySet(), is(commentsMap.keySet()));
        assertThat(allComments.values(), is(commentsMap.values()));
    }

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