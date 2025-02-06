package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_SingleLineWithMarkerTest {

    @Test
    public void setComment_SingleLineWithMarkerTest() {
        // Arrange
        String path = "path";
        String line = "# comment";
        List<String> commentLines = new ArrayList<>();
        commentLines.add(line);

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        configuration.setComment(path, line);
        Map<String, List<String>> allComments = configuration.getAllComments();

        // Assert
        assertEquals(1, allComments.getOrDefault(path, Collections.emptyList()).size());
    }

}