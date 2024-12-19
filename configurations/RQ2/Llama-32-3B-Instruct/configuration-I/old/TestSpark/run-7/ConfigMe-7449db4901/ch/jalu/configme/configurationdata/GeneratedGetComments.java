package ch.jalu.configme.configurationdata;

public class GeneratedGetComments {

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
    public void getComments() {
        // Arrange
        CommentsConfiguration configuration = new CommentsConfiguration();

        // Act
        Map<String, List<String>> comments = configuration.getComments();

        // Assert
        assertTrue(comments.isEmpty());
    }

}