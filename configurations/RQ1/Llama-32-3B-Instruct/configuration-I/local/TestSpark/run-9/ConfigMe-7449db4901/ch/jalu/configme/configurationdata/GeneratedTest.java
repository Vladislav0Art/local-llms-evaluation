package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void newCommentsConfigurationHasEmptyMap() {
        assertNotNull(commentsConfiguration.comments);
        assertEquals(0, commentsConfiguration.comments.size());
    }

    @Test
    public void newCommentsConfigurationWithExistingCommentsHasAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("comment1", "comment2"));
        when(settingsHolder.getComments()).thenReturn(existingComments);
        commentsConfiguration.setComment(settingsHolder, "path", "comment3");
        assertEquals(existingComments, commentsConfiguration.comments);
    }

    @Test
    public void newCommentsConfigurationWithExistingCommentsHasUpdatedComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("comment1", "comment2"));
        when(settingsHolder.getComments()).thenReturn(existingComments);
        commentsConfiguration.setComment(settingsHolder, "path", "comment3");
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.comments.put("path", Arrays.asList(commentLines));
        assertEquals(Arrays.asList("comment1", "comment2"), commentsConfiguration.comments.get("path"));
    }

    @Test
    public void newCommentsConfigurationWithExistingCommentsDoesNotAddNewComment() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("comment1", "comment3"));
        when(settingsHolder.getComments()).thenReturn(existingComments);
        commentsConfiguration.setComment(settingsHolder, "path", "\n");
        assertEquals(Arrays.asList("comment1", "comment3"), commentsConfiguration.comments.get("path"));
    }

    @Test
    public void setCommentOverwritesExistingComment() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("comment1", "comment2"));
        when(settingsHolder.getComments()).thenReturn(existingComments);
        commentsConfiguration.setComment(settingsHolder, "path", "comment2");
        assertEquals(Arrays.asList("comment2"), commentsConfiguration.comments.get("path"));
    }

    @Test
    public void setCommentForNonExistingPathDoesNotThrowException() {
        Map<String, List<String>> existingComments = new HashMap<>();
        when(settingsHolder.getComments()).thenReturn(existingComments);
        commentsConfiguration.setComment(settingsHolder, "non-existing-path", "comment");
        assertNotNull(commentsConfiguration.comments);
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("comment1"));
        commentsConfiguration.setComment(settingsHolder, "path", "comment2");
        assertEquals(commentsConfiguration.getAllComments(), commentMap);
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableList() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("comment1"));
        commentsConfiguration.setComment(settingsHolder, "path", "comment2");
        assertEquals(commentsConfiguration.getAllComments().get("path"), Collections.unmodifiableList(Arrays.asList("comment1")));
    }

    @Test
    public void getAllCommentsReturnsEmptyMapWhenNoCommentsAreSet() {
        assertNull(commentsConfiguration.getAllComments());
    }

}