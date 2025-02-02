package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        commentsConfiguration.setCommentsMap(commentsConfiguration.getCommentsMap());
    }

    @Test
    public void setCommentTest() {
        commentsConfiguration.setComment("test/path", "comment line 1", "comment line 2");
        assertEquals(2, commentsConfiguration.getComments().get("test/path").size());
    }

}