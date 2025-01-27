package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private java.util.HashMap<String, java.util.List<String>> commentsMap;

    public Configuration() {
        this.commentsMap = new java.util.HashMap<>();
    }

    public void put(String key, String value) {
        if (!commentsMap.containsKey(key)) {
            commentsMap.put(key, new java.util.ArrayList<>());
        }
        ((java.util.ArrayList<String>) commentsMap.get(key)).add(value);
    }

    public java.util.List<String> get(String key) {
        return commentsMap.get(key);
    }
}

public class Test1 {

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