package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentReplaceCommentTest {

    @Test
    public void setCommentReplaceCommentTest() {
        // Given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "property.path";
        String[] oldCommentLines = {"Old comment"};
        commentsConfiguration.setComment(path, oldCommentLines);
        String[] newCommentLines = {"This is a new comment"};

        // When
        commentsConfiguration.setComment(path, newCommentLines);

        // Then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey(path));
        assertTrue(allComments.get(path).containsAll(Arrays.asList(newCommentLines)));
        assertFalse(allComments.get(path).containsAll(Arrays.asList(oldCommentLines)));
    }

}