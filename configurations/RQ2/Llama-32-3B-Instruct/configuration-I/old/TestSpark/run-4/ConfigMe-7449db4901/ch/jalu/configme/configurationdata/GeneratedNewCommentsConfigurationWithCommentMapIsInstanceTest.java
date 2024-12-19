package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationWithCommentMapIsInstanceTest {

    private final CommentsConfiguration commentsConfiguration;
    private final Map<String, List<String>> commentMap;

    @BeforeAll
    public static void setUpClass() {
        // setup class level variables before all tests run
    }

    @BeforeEach
    public void setUp() {
        commentMap = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(commentMap);
    }

    @Test
    public void newCommentsConfigurationWithCommentMapIsInstanceTest() {
        // test that object created with comment map is an instance of CommentsConfiguration
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertTrue(commentsConfiguration instanceof CommentsConfiguration);
    }

}