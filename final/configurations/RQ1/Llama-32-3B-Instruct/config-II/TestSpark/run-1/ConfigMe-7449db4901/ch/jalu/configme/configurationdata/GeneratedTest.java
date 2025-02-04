package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private static final String PATH = "path";
    private static final List<String> COMMENT_LINES = Arrays.asList("comment1", "comment2");
    private static final Map<String, List<String>> EXPECTED_COMMENTS = new HashMap<>();
    private static final String EMPTY_LINE = "\n";

    @Test
    public void [Constructor]

    Test_emptyCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertEquals(0, commentsConfiguration.comments.size());
    }

    @Test
    public void [Constructor][ScenarioWithExistingComments]

    Test_commentsConfiguration_withExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, COMMENT_LINES);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        Assert.assertEquals(COMMENT_LINES, commentsConfiguration.comments.get(PATH));
    }

    @Test
    public void [setComment]

    Test_setComment_noExistingComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(PATH, COMMENT_LINES);
        Assert.assertEquals(COMMENT_LINES, commentsConfiguration.comments.get(PATH));
    }

    @Test
    public void [setComment][ScenarioWithExistingComments]

    Test_setComment_overwriteExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, Arrays.asList("existing1", "existing2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        commentsConfiguration.setComment(PATH, COMMENT_LINES);
        Assert.assertEquals(COMMENT_LINES, commentsConfiguration.comments.get(PATH));
    }

    @Test
    public void [setComment][ScenarioWithEmptyLine]

    Test_setComment_emptyLine() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, Arrays.asList("existing1", EMPTY_LINE));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        commentsConfiguration.setComment(PATH, COMMENT_LINES);
        Assert.assertEquals(Arrays.asList(COMMENT_LINES), commentsConfiguration.comments.get(PATH));
    }

    @Test
    public void [getAllComments]

    Test_getAllComments_empty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> getAllComments = commentsConfiguration.getAllComments();
        assertTrue(getAllComments.isEmpty());
    }

    @Test
    public void [getAllComments][ScenarioWithExistingComments]

    Test_getAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, COMMENT_LINES);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        Map<String, @UnmodifiableView List<String>> getAllComments = commentsConfiguration.getAllComments();
        assertEquals(COMMENT_LINES, getAllComments.get(PATH));
    }

}