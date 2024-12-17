package ch.jalu.configme.configurationdata;

public class GeneratedSetMultipleCommentsForPathDoesntOverwritePreviousCommentsTest {

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
    public void setMultipleCommentsForPathDoesntOverwritePreviousCommentsTest() {
        // set multiple comment lines for same path and verify previous comments remain
        commentsConfiguration.setComment("path", "line1", "line2");
        commentsConfiguration.setComment("path", "line3", "line4");
        assertEquals(2, commentMap.get("path").size());
    }

}