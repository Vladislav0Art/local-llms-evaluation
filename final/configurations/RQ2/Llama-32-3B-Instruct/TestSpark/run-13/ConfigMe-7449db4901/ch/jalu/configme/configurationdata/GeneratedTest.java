package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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

    @Test
    public void testEmptyComments() {
        CommentConfiguration commentConfiguration = new CommentConfiguration();
        Map<String, List<String>> comments = commentConfiguration.getAllComments();
        assertTrue(comments.isEmpty());
        assertEquals(0, comments.size());
    }

}