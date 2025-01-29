package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void commentsAreAddedToMapWhenSet() {
        CommentsConfigurationImpl config = new CommentsConfigurationImpl();
        String path = "path";
        String...commentLines = {"line1", ""};
        config.setComment(path, commentLines);

        assertEquals(1, config.comments.size());
        assertEquals(Arrays.asList("line1", ""), config.getAllComments().get(path));
    }

    @Test
    public void multipleLinesInCommentAreAdded() {
        CommentsConfigurationImpl config = new CommentsConfigurationImpl();
        String path = "path";
        String...commentLines = {"line1\nline2", ""};
        config.setComment(path, commentLines);

        assertEquals(3, config.comments.size());
        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments().get(path));
    }

    @Test
    public void emptyCommentLineDoesNotOverwriteExistingComment() {
        CommentsConfigurationImpl config = new CommentsConfigurationImpl();
        String path = "path";
        String...commentLines = {"\n", ""};
        config.setComment(path, commentLines);

        assertEquals(1, config.comments.size());
        assertEquals(Arrays.asList("line1"), config.getAllComments().get(path));
    }

    @Test
    public void setCommentSetsCommentLine() {
        CommentsConfigurationImpl config = new CommentsConfigurationImpl();
        String path = "path";
        String...commentLines = {"line1", ""};
        config.setComment(path, commentLines);

        assertEquals(1, config.comments.size());
        assertEquals(Arrays.asList("line1"), config.getAllComments().get(path));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        CommentsConfigurationImpl config = new CommentsConfigurationImpl();
        String path = "path";
        String...commentLines = {"line1", ""};
        config.setComment(path, commentLines);

        Map<String, List<String>> map = new HashMap<>(config.getAllComments());
        assertEquals(1, map.size());

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            assertEquals(Arrays.asList("line1"), entry.getValue());
        }
    }

}