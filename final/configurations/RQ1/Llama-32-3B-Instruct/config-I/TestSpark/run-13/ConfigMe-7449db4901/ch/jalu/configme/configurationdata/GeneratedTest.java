package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @BeforeTest
    public void setUpCommentsConfiguration() {
        this.commentsConfiguration = new CommentsConfiguration();
    }

    @AfterTest
    public void tearDownCommentsConfiguration() {
        this.commentsConfiguration = null;
    }

    public static final String PATH1 = "path1";
    public static final String PATH2 = "path2";

    public static final String[] COMMENT_LINES_1 = {"line1", "line2"};
    public static final String[] COMMENT_LINES_2 = {"line3", "line4"};

    @Test
    public void createCommentsConfiguration_ConstructorNoArgs_createsEmptyMap() {
        assert commentsConfiguration.comments.isEmpty();
    }

    @Test
    public void createCommentsConfiguration_ConstructorWithArgs_setsInitialComments() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Arrays.asList(COMMENT_LINES_2));
        }});
        assert commentsConfiguration.comments.equals(expected.comments);
    }

    @Test
    public void registerComment_setCommentAddsNewEntry() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Arrays.asList(COMMENT_LINES_2));
        }});
        commentsConfiguration.setComment(PATH1, COMMENT_LINES_1[0]);
        assert commentsConfiguration.comments.get(PATH1).equals(Arrays.asList(COMMENT_LINES_1));
    }

    @Test
    public void registerComment_setCommentOverwritesExistingEntry() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Collections.singletonList("line5"));
        }});
        commentsConfiguration.setComment(PATH1, COMMENT_LINES_1[0]);
        assert commentsConfiguration.comments.get(PATH1).equals(Arrays.asList(COMMENT_LINES_1));
    }

    @Test
    public void registerComment_setCommentWithEmptyLineResultingInUncommentedEntry() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList("line7"));
            put(PATH2, Collections.singletonList("line8"));
        }});
        commentsConfiguration.setComment(PATH1, "\n");
        assert commentsConfiguration.comments.get(PATH1).isEmpty();
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList("line9"));
            put(PATH2, Collections.singletonList("line10"));
        }});
        assert commentsConfiguration.getAllComments().equals(expected.getAllComments());
    }

    @Test
    public void getAllComments_returnsMapWithCorrectPaths() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Arrays.asList(COMMENT_LINES_2));
        }});
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.containsKey(PATH1);
        assert actual.containsKey(PATH2);
    }

    @Test
    public void getAllComments_returnsCommentLinesCorrectly() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Arrays.asList("line12"));
        }});
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.get(PATH1).equals(expected.comments.get(PATH1));
    }

    @Test
    public void setComment_setsCommentsForPath() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList("line14"));
        }});
        commentsConfiguration.setComment(PATH1, COMMENT_LINES_2[0]);
        assert commentsConfiguration.comments.get(PATH1).equals(expected.comments.get(PATH1));
    }

    @Test
    public void setComment_setsMultipleCommentsForPath() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1, COMMENT_LINES_2[0]));
        }});
        commentsConfiguration.setComment(PATH1, COMMENT_LINES_2);
        assert commentsConfiguration.comments.get(PATH1).equals(expected.comments.get(PATH1));
    }

}