package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void newCommentsConfigurationReturnsEmptyMap() {
        CommentsConfiguration commentConfig = new CommentsConfiguration();
        assertNotNull(commentConfig.getAllComments());
        assertTrue(commentConfig.getAllComments().isEmpty());
    }

}