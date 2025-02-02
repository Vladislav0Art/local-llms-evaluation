package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_emptyLines_test {

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
    public void setComment_emptyLines_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String commentLine1 = "line1";
        String commentLine2 = "\n\n";
        commentsConfiguration.setComment("path", commentLine1, commentLine2);
        Map<String, List<String>> comments = commentsConfiguration.getComments();
        assertEquals(Arrays.asList(commentLine1), comments.get("path"));
    }

}