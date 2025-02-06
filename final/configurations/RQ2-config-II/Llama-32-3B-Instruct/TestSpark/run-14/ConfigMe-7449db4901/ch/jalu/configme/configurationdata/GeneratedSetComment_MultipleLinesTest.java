package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_MultipleLinesTest {

    @Test
    public void setComment_MultipleLinesTest() {
        // Arrange
        String path = "path";
        String line1 = "# comment1";
        String line2 = "# comment2";
        List<String> commentLines = Arrays.asList(line1, line2);

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        configuration.setComment(path, line1, line2);
        Map<String, List<String>> allComments = configuration.getAllComments();

        // Assert
        assertEquals(commentLines.size(), allComments.getOrDefault(path, Collections.emptyList()).size());
    }

}