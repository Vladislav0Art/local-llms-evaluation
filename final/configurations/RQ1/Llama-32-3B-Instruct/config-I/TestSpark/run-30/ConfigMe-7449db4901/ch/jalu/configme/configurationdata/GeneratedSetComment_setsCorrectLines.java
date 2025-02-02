package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_setsCorrectLines {

    private final @NotNull Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = new HashMap<>(comments);
    }

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComment(String path, String... commentLines) {
        comments.put(path, Arrays.asList(commentLines));
    }

    @NotNull
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {

    @Test
    public void setComment_setsCorrectLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getComments().get(path));
    }

}