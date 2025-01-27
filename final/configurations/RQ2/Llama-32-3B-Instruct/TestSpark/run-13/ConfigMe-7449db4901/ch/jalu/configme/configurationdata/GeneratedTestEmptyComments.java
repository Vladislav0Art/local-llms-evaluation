package ch.jalu.configme.configurationdata;

public class GeneratedTestEmptyComments {

    private Map<String, List<String>> comments;

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComments(@NotNull Map<String, List<String>> comments) {
        this.comments = comments;
    }
}

public class CommentConfigurationTest {

    @Test
    public void testEmptyComments() {
        CommentConfiguration commentConfiguration = new CommentConfiguration();
        Map<String, List<String>> comments = commentConfiguration.getAllComments();
        assertTrue(comments.isEmpty());
        assertEquals(0, comments.size());
    }

}