package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private static final String VALID_COMMENT_LINES = "Comment1\nComment2";
    private static final String EMPTY_COMMENT_LINES = "\n";

    @Test
    public void newCommentsConfigurationIsEmpty() {
        assertEmpty(getAllComments());
    }

    @Test
    public void newCommentsConfigurationHasOneEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList(VALID_COMMENT_LINES)));
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertEquals(VALID_COMMENT_LINES, comments.get("path").get(0));
    }

    @Test
    public void newCommentsConfigurationHasMultipleEntries() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList("Comment1\nComment2", "Comment3\n")));
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertContainsAll(comments.get("path"), "Comment1\nComment2", "");
    }

    @Test
    public void setCommentOverwritesExistingEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList(VALID_COMMENT_LINES)));
        configuration.setComment("path", EMPTY_COMMENT_LINES);
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertEquals(EMPTY_COMMENT_LINES, comments.get("path").get(0));
    }

    @Test
    public void setCommentAddsNewEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList()));
        configuration.setComment("path", VALID_COMMENT_LINES);
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertEquals(VALID_COMMENT_LINES, comments.get("path").get(0));
    }

    @Test
    public void setCommentAddsNewEmptyEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList()));
        configuration.setComment("path", "");
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertContainsAll(comments.get("path"), "");
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList()));
        Map<String, List<String>> comments = getAllComments();
        assertTrue(comments instanceof UnmodifiableView);
    }

}