package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationWithConstructorIsInstanceTest {

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
    public void newCommentsConfigurationWithConstructorIsInstanceTest() {
        // test that object created with constructor is an instance of CommentsConfiguration
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertTrue(commentsConfiguration instanceof CommentsConfiguration);
    }

}