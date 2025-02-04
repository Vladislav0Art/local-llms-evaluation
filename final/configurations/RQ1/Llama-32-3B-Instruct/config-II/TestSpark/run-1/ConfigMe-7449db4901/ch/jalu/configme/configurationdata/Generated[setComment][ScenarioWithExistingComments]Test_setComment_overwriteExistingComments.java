package ch.jalu.configme.configurationdata;

public class Generated[setComment][ScenarioWithExistingComments]

Test_setComment_overwriteExistingComments {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [setComment][ScenarioWithExistingComments]Test_setComment_overwriteExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, Arrays.asList("existing1", "existing2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        commentsConfiguration.setComment(PATH, COMMENT_LINES);
        Assert.assertEquals(COMMENT_LINES, commentsConfiguration.comments.get(PATH));
    }

}