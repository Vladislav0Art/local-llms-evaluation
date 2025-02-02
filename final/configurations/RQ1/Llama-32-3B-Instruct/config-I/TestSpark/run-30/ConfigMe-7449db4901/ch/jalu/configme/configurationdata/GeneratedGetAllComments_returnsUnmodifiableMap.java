package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    private final @NotNull Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = new HashMap<>(comments);
    }

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComment(String path, String... commentLines) {
        comments.put(path, Arrays.asList(commentLines));
    }

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = commentsConfiguration.getAllComments();
        assertFalse(map.isEmpty());
        assertTrue(map instanceof java.util.Map);
    }

}