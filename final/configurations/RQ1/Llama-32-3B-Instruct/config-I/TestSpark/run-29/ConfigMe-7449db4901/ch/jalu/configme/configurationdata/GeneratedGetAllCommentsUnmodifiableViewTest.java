package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsUnmodifiableViewTest {

    public Map<String, List<String>> comments = new HashMap<>();

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }
}

public class CommentsConfigurationTest {

    @Test
    public void getAllCommentsUnmodifiableViewTest() throws NoSuchMethodException {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1\nline2");
        assertTrue((CommentsConfiguration.class.getMethod("getAllComments").invoke(config)).isUnmodifiable());
        assertFalse(((Map<?, ?>) ((Iterable<?>) config.getAllComments()).iterator().next()).keySet().stream().anyMatch(key -> !config.comments.containsKey(key)));
    }

    public static Map<String, List<String>> getAllComments(CommentsConfiguration config) {
        return config.comments;
    }

}