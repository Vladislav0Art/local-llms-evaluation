package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationHasMultipleEntries {

    private static final String VALID_COMMENT_LINES = "Comment1\nComment2";
    private static final String EMPTY_COMMENT_LINES = "\n";

    @Test
    public void newCommentsConfigurationHasMultipleEntries() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList("Comment1\nComment2", "Comment3\n")));
        Map<String, List<String>> comments = getAllComments();
        assertEquals(1, comments.size());
        assertContainsAll(comments.get("path"), "Comment1\nComment2", "");
    }

}