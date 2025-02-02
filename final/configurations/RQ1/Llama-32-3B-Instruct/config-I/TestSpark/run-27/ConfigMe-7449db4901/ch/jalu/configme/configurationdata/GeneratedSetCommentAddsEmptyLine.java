package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentAddsEmptyLine {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String comment) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        comments.put(path, Arrays.asList(comment));
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

    public boolean containsComment(String path) {
        return comments != null && comments.containsKey(path);
    }
}

public class GeneratedTest {

    @Test
    public void setCommentAddsEmptyLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "", "comment1");
        assertFalse(config.containsComment("path"));
    }

}