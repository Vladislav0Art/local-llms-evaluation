package ch.jalu.configme.configurationdata;

public class Generated[getAllComments][ScenarioWithExistingComments]

Test_getAllComments {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [getAllComments][ScenarioWithExistingComments]Test_getAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, COMMENT_LINES);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        Map<String, @UnmodifiableView List<String>> getAllComments = commentsConfiguration.getAllComments();
        assertEquals(COMMENT_LINES, getAllComments.get(PATH));
    }

}