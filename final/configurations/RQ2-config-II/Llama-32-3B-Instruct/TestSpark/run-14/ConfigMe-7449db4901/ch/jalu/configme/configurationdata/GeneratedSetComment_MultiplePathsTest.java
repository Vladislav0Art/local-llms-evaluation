package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_MultiplePathsTest {

    @Test
    public void setComment_MultiplePathsTest() {
        // Arrange
        String path1 = "path1";
        String line1 = "# comment1";
        String path2 = "path2";
        String line2 = "# comment2";
        List<String> commentLines = Arrays.asList(line1, line2);

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        configuration.setComment(path1, line1);
        configuration.setComment(path2, line2);
        Map<String, List<String>> allComments = configuration.getAllComments();

        // Assert
        assertEquals(commentLines.size(), allComments.getOrDefault(path1, Collections.emptyList()).size());
        assertEquals(1, allComments.getOrDefault(path2, Collections.emptyList()).size());
    }

}