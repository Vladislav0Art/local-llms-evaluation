package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_NotEmptyMapTest {

    @Test
    public void getAllComments_NotEmptyMapTest() {
        // Arrange
        String path1 = "path1";
        String line1 = "# comment1";
        String path2 = "path2";
        String line2 = "# comment2";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path1, Arrays.asList(line1));
        comments.put(path2, Collections.singletonList(line2));

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> allComments = configuration.getAllComments();

        // Assert
        assertEquals(2, allComments.size());
    }

}