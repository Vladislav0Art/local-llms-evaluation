package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    private Map<String, List<String>> comments;

    public void setComment(String path, String comment1, String comment2) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        comments.put(path, Arrays.asList(comment1, comment2));
    }

    public void setSingleComment(String path, String comment) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        comments.put(path, Collections.singletonList(comment));
    }

    public List<String> getComments(String path) {
        return comments.get(path);
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }
}

public class TestCommentsConfiguration {

    @Test
    public void testGetAllComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("newPath", Arrays.asList("comment1", "comment2"));
        configuration.comments = comments;
        assertEquals(comments, configuration.getAllComments());
    }

}