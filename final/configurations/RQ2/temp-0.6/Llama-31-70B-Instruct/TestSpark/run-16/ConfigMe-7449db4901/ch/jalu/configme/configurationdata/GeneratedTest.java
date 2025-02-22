package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Map<String, List<String>> comments;

    @Test
    public void setCommentShouldAddComment() {
        // Given
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path = "testPath";
        String[] commentLines = {"line1", "line2"};

        // When
        config.setComment(path, commentLines);

        // Then
        assertTrue(config.getAllComments().containsKey(path));
        assertEquals(Arrays.asList(commentLines), config.getAllComments().get(path));
    }

    @Test
    public void setCommentShouldOverrideExistingComment() {
        // Given
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path = "testPath";
        String[] commentLines1 = {"line1", "line2"
        }

    }