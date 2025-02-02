package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_emptyMap_test {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String... lines) {
        List<String> commentLines = new ArrayList<>();
        for (String line : lines) {
            if (!line.isEmpty()) {
                commentLines.add(line);
            }
        }
        comments.put(path, commentLines);
    }

    public Map<String, List<String>> getComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class CommentsConfigurationTest {

    @Test
    public void newCommentsConfiguration_emptyMap_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> comments = commentsConfiguration.getComments();
        assertTrue(comments.isEmpty());
    }

}