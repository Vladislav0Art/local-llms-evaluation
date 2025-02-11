package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_setsComment {

    private Map<String, List<String>> comments;

    public void setComment(String path, String... lines) {
    }

    public Map<String, List<String>> getAllComments() {
        return null;
    }

    public static class GeneratedTest {

        @Test
        public void setComment_setsComment() {
            CommentsConfiguration config = new CommentsConfiguration();
            config.setComment("path", "line1", "line2");
            TestUtil.assertionsEqual(Arrays.asList("line1", "line2"), (List<String>) config.getAllComments().get("path"));
        }

    }