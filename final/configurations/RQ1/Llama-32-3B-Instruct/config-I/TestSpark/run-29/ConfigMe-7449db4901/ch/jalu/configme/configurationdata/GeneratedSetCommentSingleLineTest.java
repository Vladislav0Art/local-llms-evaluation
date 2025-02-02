package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSingleLineTest {

    public Map<String, List<String>> comments = new HashMap<>();

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }
}

public class CommentsConfigurationTest {

    @Test
    public void setCommentSingleLineTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n");
        assertTrue(config.comments.get("path1").isEmpty());
    }

}