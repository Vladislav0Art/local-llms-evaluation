package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsReturnsCommentLinesForAllPaths {

    @Test
    public void getAllCommentsReturnsCommentLinesForAllPaths() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line1\nline2");
        configuration.setComment("path2", "\n");
        Map<String, @UnmodifiableView List<String>> allComments = configuration.getAllComments();
        assertThat(allComments.get("path1"), is(Arrays.asList("line1", "line2")));
        assertThat(allComments.get("path2"), is(Collections.singletonList""));
    }

}