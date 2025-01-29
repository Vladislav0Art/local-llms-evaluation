package ch.jalu.configme.configurationdata;

public class GeneratedMultipleLinesInCommentAreAdded {

    private final Map<String, List<String>> comments = new HashMap<>();

    @Override
    public CommentsConfiguration() {
        // implementation
    }

    @Override
    public CommentsConfiguration(@NotNull Map<String, List<String>> comments) {
        this.comments = comments;
        // implementation
    }

    @Override
    public void setComment(String path, String... commentLines) {
        if (commentLines.length == 0) {
            comments.remove(path);
        } else {
            for (String line : commentLines) {
                comments.get(path).add(line);
            }
        }
        // implementation
    }

    @Override
    public @NotNull @UnmodifiableView Map<String, @UnmodifiableView List<String>> getAllComments() {
        return new HashMap<>(comments);
    }
}

public class CommentsConfigurationTest {

    @Test
    public void multipleLinesInCommentAreAdded() {
        CommentsConfigurationImpl config = new CommentsConfigurationImpl();
        String path = "path";
        String...commentLines = {"line1\nline2", ""};
        config.setComment(path, commentLines);

        assertEquals(3, config.comments.size());
        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments().get(path));
    }

}