package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_hasEmptyCommentMap {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void newCommentsConfiguration_hasEmptyCommentMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> commentMap = commentsConfiguration.getCommentsMap();
        assertTrue(commentMap.isEmpty());
    }

}