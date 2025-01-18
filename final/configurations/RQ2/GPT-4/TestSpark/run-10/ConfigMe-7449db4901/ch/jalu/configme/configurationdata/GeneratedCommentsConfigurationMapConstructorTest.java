package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        // Given
        Map<String, List<String>> inputComments = new HashMap<String, List<String>>();
        inputComments.put("property.path", Arrays.asList("Comment 1", "Comment 2"));
        inputComments.put("another.path", Arrays.asList("Another comment"));

        // When
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputComments);

        // Then
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(inputComments, allComments);
    }

}