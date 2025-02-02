package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentMultipleLinesTest {

    public Map<String, List<String>> comments = new HashMap<>();

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }
}

public class CommentsConfigurationTest {

    @Test
    public void setCommentMultipleLinesTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1\nline2");
        assertEquals(2, ((List<String>) config.comments.get("path1")).size());
    }

}