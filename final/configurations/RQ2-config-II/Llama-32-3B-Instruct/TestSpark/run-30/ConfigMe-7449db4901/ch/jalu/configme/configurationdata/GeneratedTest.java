package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationReturnsEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.isEmpty());
    }

    @Test
    public void newCommentsConfigurationWithCommentLinesSetsCorrectly() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        List<String> commentLines = Arrays.asList("line1", "line2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(commentLines, allComments.get("comment"));
    }

    @Test
    public void setCommentOverwritesExistingCommentLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        List<String> commentLines = Arrays.asList("oldLine1", "oldLine2");
        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        allCommentsBeforeSet.put("comment", commentLines);
        Map<String, List<String>> allCommentsAfterSet = commentsConfiguration.setComment("path", "newLine1", "newLine2").getAllComments();
        assertEquals(new ArrayList<>(Arrays.asList("newLine1", "newLine2")), allCommentsAfterSet.get("comment"));
    }

    @Test
    public void setCommentForSingleLineDoesntAddNewLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        allCommentsBeforeSet.put("comment", Collections.singletonList(""));
        Map<String, List<String>> allCommentsAfterSet = commentsConfiguration.setComment("path", "").getAllComments();
        assertTrue(allCommentsAfterSet.get("comment").isEmpty());
    }

    @Test
    public void setCommentReturnsAllRegisteredComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        allCommentsBeforeSet.put("comment", Arrays.asList("line1"));
        Map<String, List<String>> allCommentsAfterSet = commentsConfiguration.setComment("path", "line2").getAllComments();
        assertTrue(allCommentsAfterSet.equals(new HashMap<>() {{
            put("comment", Arrays.asList("line1", "line2"));
        }}));
    }

}