package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_singleLine_test {

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
    public void setComment_singleLine_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "\n");
        Map<String, List<String>> comments = commentsConfiguration.getComments();
        assertTrue(comments.get("path").isEmpty());
    }

}