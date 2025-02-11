package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsWithEmptySet {

    @Test
    public void testGetAllCommentsWithEmptySet() {
        CommentConfig commentConfig = new CommentConfig();
        Set<String> expected = Collections.emptySet();
        assertTrue(commentConfig.getAllComments().equals(expected));
    }
}

public class CommentConfig {

    private Set<String> comments;

    public CommentConfig() {
        this.comments = new HashSet<>();
    }

    public void setComment(String comment) {
        comments.add(comment);
    }

    public List<String> getAllComments() {
        return new ArrayList<>(comments);
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void removeComment(String comment) {
        comments.remove(comment);
    }

}