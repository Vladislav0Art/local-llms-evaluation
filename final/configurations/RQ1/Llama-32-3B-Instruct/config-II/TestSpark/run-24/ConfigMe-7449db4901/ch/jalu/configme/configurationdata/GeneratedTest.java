package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void constructorIsNotNull() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertNotNull(comments);
    }

    @Test
    public void constructorWithCommentMapIsNotNull() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        assertNotNull(comments);
    }

    @Test
    public void setCommentUpdatesExistingComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1"));
        comments.setComment("test", "line2");
        assertEquals(1, comments.comments.get("test").size());
    }

    @Test
    public void setCommentAddsNewComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1"));
        comments.setComment("test", "line2");
        assertEquals(2, comments.comments.get("test").size());
    }

    @Test
    public void setCommentAllowsEmptyLines() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("", "line1"));
        String[] commentLines = {"", "line2"};
        comments.setComment("test", commentLines);
        assertEquals(1, comments.comments.get("test").size());
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1"));
        comments.setComment("test", "line2");
        Map<String, @UnmodifiableView List<String>> allComments = comments.getAllComments();
        assertTrue(allComments.isUnmodifiable());
    }

    @Test
    public void getAllCommentsReturnsCompleteCommentMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test1", Arrays.asList("line1"));
        commentMap.put("test2", Arrays.asList("line2"));
        comments.setComment("test1", "line3");
        comments.setComment("test2", "line4");
        Map<String, @UnmodifiableView List<String>> allComments = comments.getAllComments();
        assertEquals(commentMap, allComments);
    }

}