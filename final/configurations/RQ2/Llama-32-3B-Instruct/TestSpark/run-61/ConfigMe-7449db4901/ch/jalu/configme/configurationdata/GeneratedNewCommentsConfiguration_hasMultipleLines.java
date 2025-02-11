package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_hasMultipleLines {

    private Map<String, List<String>> comments;

    public void setComment(String path, String... lines) {
    }

    public Map<String, List<String>> getAllComments() {
        return null;
    }

    public static class GeneratedTest {

        @Test
        public void newCommentsConfiguration_hasMultipleLines() {
            Map<String, List<String>> comments = new HashMap<>();
            comments.put("path", Arrays.asList("line1", "line2"));
            CommentsConfiguration config = new CommentsConfiguration(comments);
            TestUtil.assertionsEqual(Arrays.asList("line1", "line2"), (List<String>) config.getAllComments().get("path"));
        }

    }