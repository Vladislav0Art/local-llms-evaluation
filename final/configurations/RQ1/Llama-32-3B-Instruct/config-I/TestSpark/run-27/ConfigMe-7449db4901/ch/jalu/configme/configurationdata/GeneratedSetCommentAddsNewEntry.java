package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentAddsNewEntry {

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
    public void setCommentAddsNewEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("newPath", "comment1");
        assertTrue(config.containsComment("newPath"));
    }

}