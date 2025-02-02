package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_fromMap_isNotEmpty {

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
    public void newCommentsConfiguration_fromMap_isNotEmpty() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test", Arrays.asList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertFalse(commentsConfiguration.getComments().isEmpty());
    }

}