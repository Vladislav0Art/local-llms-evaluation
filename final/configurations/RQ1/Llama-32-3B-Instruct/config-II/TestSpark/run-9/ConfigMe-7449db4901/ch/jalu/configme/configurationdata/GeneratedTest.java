package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.isEmpty(), is(true));
    }

    @Test
    public void newCommentsConfiguration_fromHashMap_isPassedThrough() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration comments = new CommentsConfiguration(commentsMap);
        Map<String, List<String>> commentsMapPassed = comments.comments;
        assertThat(commentsMap.equals(commentsMapPassed), is(true));
    }

    @Test
    public void setComment_setsCommentsForPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "comment line 2";
        comments.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.get(path), is(List.of(commentLine1, commentLine2)));
    }

    @Test
    public void setComment_setsEmptyLinesForPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "\n"; // empty line
        comments.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.get(path).size(), is(0));
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> allComments = comments.getAllComments();
        assertThat(allComments.isEmpty(), is(true));
    }

    @Test
    public void setComment_setsMultipleLinesForPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "comment line 2";
        comments.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.get(path).size(), is(2));
    }

    @Test
    public void setComment_setsMultipleLinesForPathWithEmptyComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "";
        String commentLine2 = "";
        comments.setComment(path, commentLine1, commentLine2);
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.get(path).size(), is(0));
    }

}