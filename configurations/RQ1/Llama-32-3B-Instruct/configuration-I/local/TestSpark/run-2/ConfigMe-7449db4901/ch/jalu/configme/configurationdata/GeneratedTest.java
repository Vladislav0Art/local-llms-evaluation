package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testComments() {
        // Arrange
        CommentsConfiguration comments = new CommentsConfiguration();

        // Act
        List<String> existingLines = new ArrayList<>(Arrays.asList("line1", "line2"));
        String key1 = "key1";
        String newKey = "newKey";

        comments.setComment(key1, existingLines);
        comments.setComment(newKey, Collections.singletonList("newLine"));

        // Assert
        assertEquals(existingLines, comments.getComments().get(key1));
        assertEquals(Collections.singletonList("newLine"), comments.getComments().get(newKey));

        Map<String, @UnmodifiableView List<String>> result = comments.getAllComments();
        assertEquals(2, result.size());

        assertEquals(existingLines, result.get(key1));
        assertEquals(Collections.singletonList("newLine"), result.get(newKey));
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> commentMap;

    public CommentsConfiguration() {
        this.commentMap = new HashMap<>();
    }

    public void setComment(String key, List<String> value) {
        commentMap.put(key, value);
    }

    public List<String> getComments() {
        return commentMap.values().stream()
                .filter(value -> !value.isEmpty())
                .findFirst()
                .orElse(null);
    }

    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(commentMap);
    }

}