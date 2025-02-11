package ch.jalu.configme.configurationdata;

public class GeneratedTestAddComment {

    private Set<String> comments;

    public CommentConfig() {
    }

    public void setComment(String comment) {
        if (comments == null) {
            comments = new HashSet<>();
        }
        comments.add(comment);
    }

    public List<String> getAllComments() {
        return new ArrayList<>(comments != null ? comments : Collections.emptySet());
    }

    public void addComment(String comment) {
        if (comments == null) {
            comments = new HashSet<>();
        }
        comments.add(comment);
    }
}

public class TestCommentConfig {

    @Test
    public void testAddComment() {
        CommentConfig commentConfig = new CommentConfig();
        commentConfig.addComment("line2");
        commentConfig.addComment("line3");
        List<String> expected = Arrays.asList("line2", "line3");
        Set<String> actual = commentConfig.getAllComments();
        assertEquals(expected, actual);
    }

}