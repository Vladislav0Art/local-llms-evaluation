package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        // Arrange
        Configuration configuration = new Configuration();

        // Act
        configuration.getAllComments().put("path", java.util.Arrays.asList("comment1"));

        // Assert
        assertTrue(configuration.getAllComments().get("path").equals(java.util.Arrays.asList("comment1")));
    }

}