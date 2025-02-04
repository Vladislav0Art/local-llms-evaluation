package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorCreatesEmptyCommentsMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertThat(configuration.comments, is(Collections.emptyMap()));
    }

    @Test
    public void constructorUsesProvidedCommentsMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertThat(configuration.comments, is(comments));
    }

    @Test
    public void setCommentAddsLinesForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line1\nline2");
        assertThat(comments.get("path1"), is(Arrays.asList("line1", "line2")));
    }

    @Test
    public void setCommentAddsEmptyLineForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "\n");
        assertThat(comments.get("path1"), is(Collections.singletonList""));
    }

    @Test
    public void setCommentOverwritesExistingLinesForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line3\nline4");
        configuration.setComment("path1", "line5", "line6");
        assertThat(comments.get("path1"), is(Arrays.asList("line5", "line6")));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> allComments = configuration.getAllComments();
        assertThat(allComments, is(Collections.unmodifiableMap(comments)));
    }

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