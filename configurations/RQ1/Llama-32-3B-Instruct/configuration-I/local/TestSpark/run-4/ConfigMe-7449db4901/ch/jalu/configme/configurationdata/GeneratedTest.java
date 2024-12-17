package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void testNewCommentsConfiguration() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
    }

    @Test
    public void testNewCommentsConfigurationWithMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.comments);
    }

    @Test
    public void testSetCommentLinesNoPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(IndexOutOfBoundsException.class, () -> config.setComment(null, "line1", "line2"));
    }

    @Test
    public void testSetCommentLinesWithNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "\n");
        assertEquals(Collections.singletonList(""), config.comments.get("test"));
    }

    @Test
    public void testSetCommentLinesWithNoNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get("test"));
    }

    @Test
    public void testSetCommentLinesWithMultiplePath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1.1");
        config.setComment("path1", "line1.2");
        config.setComment("path2", "line2.1");

        assertEquals(Arrays.asList("line1.1", "line1.2"), config.comments.get("path1"));
        assertEquals(Collections.singletonList("line2.1"), config.comments.get("path2"));
    }

    @Test
    public void testGetAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        config.setComment("path2", "line2");

        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments());
    }

    @Test
    public void testGetAllCommentsUnmodifiable() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));

        config.setComment("test", "line1");
        config.setComment("test", "line2");

        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments());
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public void setComment(String path, String line) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(line);
    }

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>(comments); // return an unmodifiable map
    }

}