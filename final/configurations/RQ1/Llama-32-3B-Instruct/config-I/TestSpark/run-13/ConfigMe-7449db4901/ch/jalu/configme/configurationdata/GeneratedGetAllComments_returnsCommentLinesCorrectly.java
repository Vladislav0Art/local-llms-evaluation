package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_returnsCommentLinesCorrectly {

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
    public void getAllComments_returnsCommentLinesCorrectly() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Arrays.asList("line12"));
        }});
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.get(PATH1).equals(expected.comments.get(PATH1));
    }

}