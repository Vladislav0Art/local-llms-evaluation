package ch.jalu.configme.configurationdata;

public class Generated[getAllComments]

Test_getAllComments_empty {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [getAllComments]Test_getAllComments_empty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> getAllComments = commentsConfiguration.getAllComments();
        assertTrue(getAllComments.isEmpty());
    }

}