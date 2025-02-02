package ch.jalu.configme.configurationdata;

public class GeneratedCreateCommentsConfiguration_ConstructorNoArgs_createsEmptyMap {

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

}