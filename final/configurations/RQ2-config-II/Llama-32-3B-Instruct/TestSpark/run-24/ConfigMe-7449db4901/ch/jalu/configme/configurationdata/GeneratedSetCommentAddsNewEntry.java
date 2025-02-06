package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentAddsNewEntry {

    private static final String VALID_COMMENT_LINES = "Comment1\nComment2";
    private static final String EMPTY_COMMENT_LINES = "\n";

    @Test
    public void setCommentAddsNewEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList()));
        configuration.setComment("path", VALID_COMMENT_LINES);
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertEquals(VALID_COMMENT_LINES, comments.get("path").get(0));
    }

}