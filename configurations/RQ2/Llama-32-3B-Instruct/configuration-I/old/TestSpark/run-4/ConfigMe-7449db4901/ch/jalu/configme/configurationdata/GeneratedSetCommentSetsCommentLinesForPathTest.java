package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSetsCommentLinesForPathTest {

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
    public void setCommentSetsCommentLinesForPathTest() {
        // set comment lines for path and verify they have been added to the configuration
        commentsConfiguration.setComment("path", "line1", "line2");
        assertEquals(2, commentMap.get("path").size());
    }

}