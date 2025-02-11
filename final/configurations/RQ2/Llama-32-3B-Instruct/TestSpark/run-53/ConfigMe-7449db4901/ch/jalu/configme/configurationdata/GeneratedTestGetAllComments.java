package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

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
    public void testGetAllComments() {
        CommentConfig commentConfig = new CommentConfig();
        commentConfig.setComment("line1");
        List<String> expected = Arrays.asList("line1");
        Set<String> actual = commentConfig.getAllComments();
        assertEquals(expected, actual);
    }

}