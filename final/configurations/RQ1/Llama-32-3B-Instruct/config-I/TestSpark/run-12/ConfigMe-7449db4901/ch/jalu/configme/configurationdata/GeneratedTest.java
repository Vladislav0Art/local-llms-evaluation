package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfigurationHasEmptyLinesWhenRegisteringEmptyLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {"\n"};
        String path = "path";
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().get(path).isEmpty());
    }

    @Test
    public void setCommentForExistingPathOverwritesExistingValue() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path1", "newLine1", "newLine2");
        assertEquals(Arrays.asList("newLine1", "newLine2"), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void setCommentForExistingPathOverwritesExistingValueWithDifferentPaths() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path2", "line3\nline4");
        assertEquals(Arrays.asList("newLine1", "newLine2"), commentsConfiguration.getAllComments().get("path1"));
        assertEquals(Arrays.asList("line3", "line4"), commentsConfiguration.getAllComments().get("path2"));
    }

    @Test
    public void setCommentForNewPathAddsValue() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path3", "newLine1", "newLine2");
        assertEquals(Arrays.asList("newLine1", "newLine2"), commentsConfiguration.getAllComments().get("path3"));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments instanceof java.util.Map);
    }

}