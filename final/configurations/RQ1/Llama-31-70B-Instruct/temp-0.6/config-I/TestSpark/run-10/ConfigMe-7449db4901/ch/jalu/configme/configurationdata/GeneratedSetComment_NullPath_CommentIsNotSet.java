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
public class GeneratedSetComment_NullPath_CommentIsNotSet {

    @Test
    public void setComment_NullPath_CommentIsNotSet() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = new String[]{"Line 1", "Line 2"};

        // Act
        commentsConfiguration.setComment(null, commentLines);

        // Assert
        assertNull(commentsConfiguration.getAllComments().get(null));
    }

}