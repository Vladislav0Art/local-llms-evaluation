package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedGetAllCommentsReadonlyViewTest {

    @Test
    public void getAllCommentsReadonlyViewTest() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.emptyList());
        String[] commentLines = {"line1\nline2", "line3"};
        List<String> lines = Arrays.asList(commentLines);

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> result = configuration.getAllComments();

        // Assert
        assertEquals(2, result.size());
    }

}