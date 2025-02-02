package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_ReturnsMap {

    @Test
    public void getAllComments_ReturnsMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        comments.setComment("path", Arrays.asList("line1", "line2"));
        Map<String, List<String>> result = comments.getAllComments();
        assertEquals(expected, result);
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComment(String path, List<String> lines) {
        comments.put(path, lines);
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }

}