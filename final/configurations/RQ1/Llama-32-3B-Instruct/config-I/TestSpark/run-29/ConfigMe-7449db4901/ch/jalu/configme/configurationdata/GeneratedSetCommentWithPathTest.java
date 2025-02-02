package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithPathTest {

    public Map<String, List<String>> comments = new HashMap<>();

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }
}

public class CommentsConfigurationTest {

    @Test
    public void setCommentWithPathTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        assertEquals(2, config.comments.size());
    }

}