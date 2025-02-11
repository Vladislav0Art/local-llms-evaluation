package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_hasNoLines {

    private Map<String, List<String>> comments;

    public void setComment(String path, String... lines) {
    }

    public Map<String, List<String>> getAllComments() {
        return null;
    }

    public static class GeneratedTest {

        @Test
        public void newCommentsConfiguration_hasNoLines() {
            CommentsConfiguration config = new CommentsConfiguration();
            assertEquals(Collections.emptyMap(), config.getAllComments());
        }

    }