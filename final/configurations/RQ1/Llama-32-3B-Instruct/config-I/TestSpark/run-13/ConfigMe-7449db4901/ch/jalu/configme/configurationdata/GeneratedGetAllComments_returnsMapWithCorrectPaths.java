package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_returnsMapWithCorrectPaths {

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
    public void getAllComments_returnsMapWithCorrectPaths() {
        CommentsConfiguration expected = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put(PATH1, Arrays.asList(COMMENT_LINES_1));
            put(PATH2, Arrays.asList(COMMENT_LINES_2));
        }});
        Map<String, @UnmodifiableView List<String>> actual = commentsConfiguration.getAllComments();
        assert actual.containsKey(PATH1);
        assert actual.containsKey(PATH2);
    }

}