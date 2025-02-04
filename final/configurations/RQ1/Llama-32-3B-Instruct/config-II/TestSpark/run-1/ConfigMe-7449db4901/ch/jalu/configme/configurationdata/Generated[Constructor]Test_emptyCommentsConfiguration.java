package ch.jalu.configme.configurationdata;

public class Generated[Constructor]

Test_emptyCommentsConfiguration {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [Constructor]Test_emptyCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertEquals(0, commentsConfiguration.comments.size());
    }

}