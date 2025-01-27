package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPutNewComment {

    @Test
    public void testPutNewComment() {
        // Arrange
        Configuration configuration = new Configuration();
        java.util.HashMap<String, java.util.List<String>> commentsMap = new java.util.HashMap<>();
        commentsMap.put("new path", java.util.Arrays.asList("comment3"));

        // Act
        configuration.getAllComments().put("new path", commentsMap.get("new path"));

        // Assert
        assertTrue(configuration.getAllComments().get("new path").equals(java.util.Arrays.asList("comment3")));
    }
}

class Configuration {
    public java.util.Map<String, java.util.List<String>> getAllComments() {
        return new java.util.HashMap<>();
    }

    public void put(String key, java.util.List<String> value) {
        getAllComments().put(key, value);
    }

}