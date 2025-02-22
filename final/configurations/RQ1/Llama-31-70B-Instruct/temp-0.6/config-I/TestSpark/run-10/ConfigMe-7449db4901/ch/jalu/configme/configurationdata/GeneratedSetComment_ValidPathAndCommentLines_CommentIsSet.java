package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_ValidPathAndCommentLines_CommentIsSet {

    @Test
    public void setComment_ValidPathAndCommentLines_CommentIsSet() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test_path";
        String[] commentLines = new String[]{"Line 1", "Line 2"};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        List<String> actualCommentLines = commentsConfiguration.getAllComments().get(path);
        assertNotNull(actualCommentLines);
        assertEquals(Arrays.asList(commentLines), actualCommentLines);
    }

}