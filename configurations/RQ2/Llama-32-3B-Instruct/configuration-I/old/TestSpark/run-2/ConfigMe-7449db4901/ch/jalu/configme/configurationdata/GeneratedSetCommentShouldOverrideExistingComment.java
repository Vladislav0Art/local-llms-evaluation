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
public class GeneratedSetCommentShouldOverrideExistingComment {

    @Mock
    private Map<String, List<String>> comments;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(comments);
    }

    @Test
    public void setCommentShouldOverrideExistingComment() {
        // Arrange
        CommentsConfiguration configuration = getCommentsConfiguration();
        List<String> existingComments = new ArrayList<>();

        String path = "path1";
        List<String> commentLines = new ArrayList<>();
        commentLines.add("comment line");

        comments.put(path, existingComments);
        configuration.setComment(path, commentLine);

        // Assert
        verify(comments).put(anyString(), Mockito.any(List.class));
    }

}