package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_ReturnsAllComments_WhenSetSuccessfully {

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
    public void getAllComments_ReturnsAllComments_WhenSetSuccessfully() throws Exception {
        String path = "test/path";
        List<String> commentLines = Collections.singletonList("comment1");
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment(path, commentLines);
        Map<String, List<String>> result = config.getAllComments();
        assertEquals(commentLines, result.get(path));
    }

}