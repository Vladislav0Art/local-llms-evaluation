package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentEmptyLineTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        commentsConfiguration.setCommentsMap(commentsConfiguration.getCommentsMap());
    }

    @Test
    public void setCommentEmptyLineTest() {
        commentsConfiguration.setComment("test/path", "\n");
        assertEquals(Collections.singletonList(""), commentsConfiguration.getComments().get("test/path"));
    }

}