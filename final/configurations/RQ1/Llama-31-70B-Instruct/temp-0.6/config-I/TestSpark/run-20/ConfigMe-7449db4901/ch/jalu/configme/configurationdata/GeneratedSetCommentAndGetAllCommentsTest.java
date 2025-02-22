package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedSetCommentAndGetAllCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    // Test method to set and get comments

    @Test
    public void setCommentAndGetAllCommentsTest() {
        // Arrange
        commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = new String[]{"test comment"};

        // Act
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Assert
        assertEquals(commentLines, allComments.get(path));
    }

}