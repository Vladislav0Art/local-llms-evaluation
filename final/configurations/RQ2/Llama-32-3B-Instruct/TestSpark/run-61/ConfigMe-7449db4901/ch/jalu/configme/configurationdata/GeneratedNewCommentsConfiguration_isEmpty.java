package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_isEmpty {

    private Map<String, List<String>> comments;

    public void setComment(String path, String... lines) {
    }

    public Map<String, List<String>> getAllComments() {
        return null;
    }

    public static class GeneratedTest {

        @Test
        public void newCommentsConfiguration_isEmpty() {
            CommentsConfiguration config = new CommentsConfiguration();
            assertTrue(config.getAllComments().isEmpty());
        }

    }