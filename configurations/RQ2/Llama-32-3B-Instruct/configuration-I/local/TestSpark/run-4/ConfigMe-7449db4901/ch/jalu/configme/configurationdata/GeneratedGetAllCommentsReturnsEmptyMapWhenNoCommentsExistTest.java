package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsReturnsEmptyMapWhenNoCommentsExistTest {

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
    public void getAllCommentsReturnsEmptyMapWhenNoCommentsExistTest() {
        // verify that an empty map is returned when no comments exist
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.isEmpty());
    }

}