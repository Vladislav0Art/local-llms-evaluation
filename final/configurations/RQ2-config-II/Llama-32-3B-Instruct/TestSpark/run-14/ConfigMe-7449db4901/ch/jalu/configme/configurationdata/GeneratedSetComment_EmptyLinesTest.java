package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_EmptyLinesTest {

    @Test
    public void setComment_EmptyLinesTest() {
        // Arrange
        String path = "path";
        String line = "";
        List<String> commentLines = new ArrayList<>();

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        configuration.setComment(path, line);
        Map<String, List<String>> allComments = configuration.getAllComments();

        // Assert
        assertTrue(allComments.getOrDefault(path, Collections.emptyList()).isEmpty());
    }

}