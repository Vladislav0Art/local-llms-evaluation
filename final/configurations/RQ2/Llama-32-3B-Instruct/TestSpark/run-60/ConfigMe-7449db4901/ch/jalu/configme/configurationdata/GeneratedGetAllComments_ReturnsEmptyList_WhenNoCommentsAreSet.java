package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_ReturnsEmptyList_WhenNoCommentsAreSet {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public void setComment(String path, List<String> commentLines) {
        if (path == null || commentLines == null) {
            throw new NullPointerException("Path and Comment lines cannot be null");
        }
        comments.put(path, commentLines);
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {

    @Test
    public void getAllComments_ReturnsEmptyList_WhenNoCommentsAreSet() {
        String path = "test/path";
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.getAllComments());
    }

}