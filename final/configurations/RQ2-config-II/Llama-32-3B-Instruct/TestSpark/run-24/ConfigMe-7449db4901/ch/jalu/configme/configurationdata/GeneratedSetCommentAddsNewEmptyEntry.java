package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentAddsNewEmptyEntry {

    private static final String VALID_COMMENT_LINES = "Comment1\nComment2";
    private static final String EMPTY_COMMENT_LINES = "\n";

    @Test
    public void setCommentAddsNewEmptyEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList()));
        configuration.setComment("path", "");
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertContainsAll(comments.get("path"), "");
    }

}