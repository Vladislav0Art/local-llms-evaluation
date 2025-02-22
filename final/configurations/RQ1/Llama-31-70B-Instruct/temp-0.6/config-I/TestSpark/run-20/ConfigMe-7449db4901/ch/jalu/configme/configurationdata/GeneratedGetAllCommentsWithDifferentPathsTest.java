package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedGetAllCommentsWithDifferentPathsTest {

    private CommentsConfiguration commentsConfiguration;

    // Test method to set and get comments

    @Test
    public void getAllCommentsWithDifferentPathsTest() {
        // Arrange
        commentsConfiguration = new CommentsConfiguration();
        String path1 = "test1";
        String[] commentLines1 = new String[]{"test comment1"};
        String path2 = "test2";
        String[] commentLines2 = new String[]{"test comment2"};

        // Act
        commentsConfiguration.setComment(path1, commentLines1);
        commentsConfiguration.setComment(path2, commentLines2);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Assert
        assertEquals(commentLines1, allComments.get(path1));
        assertEquals(commentLines2, allComments.get(path2));
    }

}