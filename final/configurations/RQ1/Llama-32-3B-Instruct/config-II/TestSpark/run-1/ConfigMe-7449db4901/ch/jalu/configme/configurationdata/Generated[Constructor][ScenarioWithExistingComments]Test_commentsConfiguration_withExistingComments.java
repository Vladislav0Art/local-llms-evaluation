package ch.jalu.configme.configurationdata;

public class Generated[Constructor][ScenarioWithExistingComments]

Test_commentsConfiguration_withExistingComments {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [Constructor][ScenarioWithExistingComments]Test_commentsConfiguration_withExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, COMMENT_LINES);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        Assert.assertEquals(COMMENT_LINES, commentsConfiguration.comments.get(PATH));
    }

}