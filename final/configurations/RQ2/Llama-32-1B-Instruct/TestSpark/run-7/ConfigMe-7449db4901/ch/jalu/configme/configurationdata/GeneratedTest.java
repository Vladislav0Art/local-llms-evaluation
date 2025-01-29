package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationException;
import ch.jalu.configme.settings.SettingsHolder;
import ch.jalu.configme.exceptions.ConfigurationExceptionBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment_SingleLine() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void testSetComment_MultipleLines() {
        commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment("path", commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void testSetComment_SingleLine_MultiplePaths() {
        commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String path2 = "path2";
        commentsConfiguration.setComment(path1, "");
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        commentsConfiguration.setComment(path2, commentLines);
        Mockito.when(settingsHolder.getComments()).thenReturn(Arrays.asList(commentLines));
        assertEquals(Collections.singletonList(Arrays.asList("line1", "line2")), commentsConfiguration.getAllComments().get(path1));
    }

    @Test
    public void testSetComment_MultiplePaths() {
        commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String path2 = "path2";
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        commentsConfiguration.setComment(path1, commentLines);
        Mockito.when(settingsHolder.getComments()).thenReturn(Arrays.asList(commentLines));
        Mockito.when(settingsHolder.getComments(path1)).thenReturn(Collections.singletonList(Arrays.asList("line1", "line2")));
        commentsConfiguration.setComment(path2, commentLines);
        assertEquals(Arrays.asList(Arrays.asList("line1", "line2")), commentsConfiguration.getAllComments().get(path1));
    }

    @Test
    public void testGetAllComments_SinglePath() {
        commentsConfiguration = new CommentsConfiguration();
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        Mockito.when(settingsHolder.getComments(null)).thenReturn(Collections.emptyList());
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void testGetAllComments_MultiplePaths() {
        commentsConfiguration = new CommentsConfiguration();
        String[] commentLines1 = {"line1", "line2"};
        String[] commentLines2 = {"line3", "line4"};
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        Mockito.when(settingsHolder.getComments("path1")).thenReturn(Arrays.asList(commentLines1));
        Mockito.when(settingsHolder.getComments("path2")).thenReturn(Arrays.asList(commentLines2));
        assertEquals(Arrays.asList(Arrays.asList("line1", "line2"), Arrays.asList("line3", "line4")), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void testSetCommentToNonExistingPath() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        try {
            commentsConfiguration.setComment(path, commentLines);
            fail("Expected ConfigurationException");
        } catch (CommentsConfigurationException e) {
            // Expected
        }
    }

    @Test
    public void testGetAllCommentsToNonExistingPath() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        try {
            commentsConfiguration.getAllComments().get(path);
            fail("Expected ConfigurationException");
        } catch (CommentsConfigurationException e) {
            // Expected
        }
    }

    @Test
    public void testSetCommentToNonExistingCommentPath() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        try {
            commentsConfiguration.setComment(path, commentLines);
            fail("Expected ConfigurationException");
        } catch (CommentsConfigurationException e) {
            // Expected
        }
    }

    @Test
    public void testGetAllCommentsToNonExistingCommentPath() {
        commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyList());
        try {
            commentsConfiguration.getAllComments().get(path);
            fail("Expected ConfigurationException");
        } catch (CommentsConfigurationException e) {
            // Expected
        }
    }

}