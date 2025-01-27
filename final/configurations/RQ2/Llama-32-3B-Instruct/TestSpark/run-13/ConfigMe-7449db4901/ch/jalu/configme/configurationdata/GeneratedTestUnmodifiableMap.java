package ch.jalu.configme.configurationdata;

public class GeneratedTestUnmodifiableMap {

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
    public void testUnmodifiableMap() {
        CommentConfiguration commentConfiguration = new CommentConfiguration();
        Map<String, List<String>> comments = commentConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("path1"));
        assertTrue(comments.containsValue(List.of("comment1")));
        try {
            comments.put("newKey", List.of("newComment"));
            fail("Expected an exception");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

}