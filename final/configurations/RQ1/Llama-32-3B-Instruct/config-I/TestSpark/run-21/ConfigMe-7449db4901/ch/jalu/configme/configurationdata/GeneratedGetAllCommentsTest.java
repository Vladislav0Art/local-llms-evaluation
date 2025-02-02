package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        commentsConfiguration.setCommentsMap(commentsConfiguration.getCommentsMap());
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test/path", Arrays.asList("comment line 1", "comment line 2"));
        commentsConfiguration.setCommentsMap(commentMap);
        assertEquals(commentMap, commentsConfiguration.getAllComments());
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> commentsMap;

    public void setCommentsMap(Map<String, List<String>> commentsMap) {
        this.commentsMap = commentsMap;
    }

    public Map<String, List<String>> getCommentsMap() {
        return commentsMap;
    }

    public void setComment(String path, String line1, String line2) {
        if (commentsMap == null) {
            commentsMap = new HashMap<>();
        }
        commentsMap.put(path, Arrays.asList(line1, line2));
    }

    public Map<String, List<String>> getComments() {
        return commentsMap;
    }

    public Map<String, List<String>> getAllComments() {
        return commentsMap;
    }

}