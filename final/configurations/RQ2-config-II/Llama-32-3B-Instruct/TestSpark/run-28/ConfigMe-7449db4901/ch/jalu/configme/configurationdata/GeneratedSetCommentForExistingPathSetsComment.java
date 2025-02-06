package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForExistingPathSetsComment {

    @Test
    public void setCommentForExistingPathSetsComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "newComment");
        assertThat(commentsConfiguration.getAllComments().get("path1"), is(Arrays.asList("newComment")));
    }

}