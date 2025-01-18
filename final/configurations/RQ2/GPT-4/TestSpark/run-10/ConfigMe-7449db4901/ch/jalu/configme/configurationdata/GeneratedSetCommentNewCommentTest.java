package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentNewCommentTest {

    @Test
    public void setCommentNewCommentTest() {
        // Given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "property.path";
        String[] commentLines = {"This is a comment", "This is another comment"};

        // When
        commentsConfiguration.setComment(path, commentLines);

        // Then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey(path));
        assertTrue(allComments.get(path).containsAll(Arrays.asList(commentLines)));
    }

}