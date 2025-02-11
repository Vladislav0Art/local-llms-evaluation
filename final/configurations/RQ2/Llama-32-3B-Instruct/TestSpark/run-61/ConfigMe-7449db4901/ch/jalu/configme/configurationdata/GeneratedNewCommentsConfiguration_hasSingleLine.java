package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_hasSingleLine {

    private Map<String, List<String>> comments;

    public void setComment(String path, String... lines) {
    }

    public Map<String, List<String>> getAllComments() {
        return null;
    }

    public static class GeneratedTest {

        @Test
        public void newCommentsConfiguration_hasSingleLine() {
            Map<String, List<String>> comments = new HashMap<>();
            comments.put("path", Collections.emptyList());
            CommentsConfiguration config = new CommentsConfiguration(comments);
            assertTrue(config.getAllComments().containsKey("path") && ((List<String>) config.getAllComments().get("path")).isEmpty());
        }

    }