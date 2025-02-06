package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_EmptyMapTest {

    @Test
    public void getAllComments_EmptyMapTest() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();

        // Act
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> allComments = configuration.getAllComments();

        // Assert
        assertTrue(allComments.isEmpty());
    }

}