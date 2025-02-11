package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_InvalidTypeForCommentLines_ExpectException {

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
    public void setComment_InvalidTypeForCommentLines_ExpectException() {
        String path = "test/path";
        List<String> commentLines = null;
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.setComment(path, commentLines));
    }

}