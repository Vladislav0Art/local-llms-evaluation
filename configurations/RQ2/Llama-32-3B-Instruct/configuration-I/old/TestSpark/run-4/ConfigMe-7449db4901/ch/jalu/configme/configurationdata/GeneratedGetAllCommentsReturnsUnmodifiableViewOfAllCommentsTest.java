package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsReturnsUnmodifiableViewOfAllCommentsTest {

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
    public void getAllCommentsReturnsUnmodifiableViewOfAllCommentsTest() {
        // set some comment lines and verify they are returned in a read only view
        commentsConfiguration.setComment("path", "line1", "line2");
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.get("path").containsAll(Arrays.asList("line1", "line2")));
    }

}