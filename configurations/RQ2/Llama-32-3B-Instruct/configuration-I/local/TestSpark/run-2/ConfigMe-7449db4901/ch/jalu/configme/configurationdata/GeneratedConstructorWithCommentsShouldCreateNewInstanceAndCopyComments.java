package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorWithCommentsShouldCreateNewInstanceAndCopyComments {

    @Mock
    private Map<String, List<String>> comments;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(comments);
    }

    @Test
    public void constructorWithCommentsShouldCreateNewInstanceAndCopyComments() {
        // Arrange
        List<String> commentLines1 = new ArrayList<>();
        List<String> commentLines2 = new ArrayList<>();

        comments.put("path1", commentLines1);
        comments.put("path2", commentLines2);

        // Act
        CommentsConfiguration configuration = getCommentsConfiguration();

        // Assert
        assertNotNull(configuration);
        assertEquals(commentLines1, configuration.getAllComments().get("path1"));
        assertEquals(commentLines2, configuration.getAllComments().get("path2"));
    }

}