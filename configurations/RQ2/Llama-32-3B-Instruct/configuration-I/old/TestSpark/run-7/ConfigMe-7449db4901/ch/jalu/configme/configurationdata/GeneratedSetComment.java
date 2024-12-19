package ch.jalu.configme.configurationdata;

public class GeneratedSetComment {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public void setComment(String key, String value) {
        if (!comments.containsKey(key)) {
            comments.put(key, new ArrayList<>());
        }
        comments.get(key).add(value);
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }
}

public class GeneratedTest {

    @Test
    public void setComment() {
        // Arrange
        CommentsConfiguration configuration = new CommentsConfiguration();
        String comment = "Hello World";

        // Act
        configuration.setComment("key", comment);

        // Assert
        assertEquals(comment, configuration.getComments().get(0));
    }

}