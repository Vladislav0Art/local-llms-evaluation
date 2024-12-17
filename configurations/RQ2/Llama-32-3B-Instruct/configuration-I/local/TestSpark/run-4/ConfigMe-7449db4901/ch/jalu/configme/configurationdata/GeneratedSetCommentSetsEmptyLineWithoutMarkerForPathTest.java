package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSetsEmptyLineWithoutMarkerForPathTest {

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
    public void setCommentSetsEmptyLineWithoutMarkerForPathTest() {
        // set empty line without marker for path and verify it has been added to the configuration
        commentsConfiguration.setComment("path", "");
        assertTrue(commentMap.get("path").isEmpty());
    }

}