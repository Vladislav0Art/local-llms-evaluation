package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForNewPathSetsComment {

    @Test
    public void setCommentForNewPathSetsComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "newComment");
        assertThat(commentsConfiguration.getAllComments().get("path1"), is(Collections.singletonList("newComment")));
    }

}