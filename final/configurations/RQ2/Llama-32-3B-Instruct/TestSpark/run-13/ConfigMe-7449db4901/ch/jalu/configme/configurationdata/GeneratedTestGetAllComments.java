package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

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
    public void testGetAllComments() {
        CommentConfiguration commentConfiguration = new CommentConfiguration();
        commentConfiguration.setComments(Map.of("path1", List.of("comment1")));
        assertEquals(1, commentConfiguration.getAllComments().size());
        assertTrue(commentConfiguration.getAllComments().containsKey("path1"));
        assertTrue(commentConfiguration.getAllComments().containsValue(List.of("comment1")));
    }

}