package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        // Given
        String path = "test";
        String[] commentLines = {"firstLine", "secondLine"};

        // When
        commentsConfiguration.setComment(path, commentLines);

        // Then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList(commentLines), allComments.get(path));
    }

    @Test
    public void getAllCommentsTest() {
        // Given
        String path = "test";
        String[] commentLines = {"firstLine", "secondLine"};
        commentsConfiguration.setComment(path, commentLines);

        // When
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Then
        assertNotNull(allComments);
        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList(commentLines), allComments.get(path));
    }

}