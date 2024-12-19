package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationIsInstanceTest {

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
    public void newCommentsConfigurationIsInstanceTest() {
        // test that the object is an instance of CommentsConfiguration
        assertTrue(commentsConfiguration instanceof CommentsConfiguration);
    }

}