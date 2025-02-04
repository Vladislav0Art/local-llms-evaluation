package ch.jalu.configme.configurationdata;

public class Generated[setComment]

Test_setComment_noExistingComments {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [setComment]Test_setComment_noExistingComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(PATH, COMMENT_LINES);
        Assert.assertEquals(COMMENT_LINES, commentsConfiguration.comments.get(PATH));
    }

}