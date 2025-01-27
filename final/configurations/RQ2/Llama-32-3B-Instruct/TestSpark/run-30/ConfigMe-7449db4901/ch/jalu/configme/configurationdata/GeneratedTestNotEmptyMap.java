package ch.jalu.configme.configurationdata;

public class GeneratedTestNotEmptyMap {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNotEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        commentMap.put("path2", Arrays.asList("commentLine2"));

        assertTrue(!new HashMap<>(commentMap).equals(new HashMap<>()));
    }

}

public class CommentsConfiguration {

    private Map<String, List<String>> commentsMap = new HashMap<>();

    public Map<String, List<String>> getCommentsMap() {
        return commentsMap;
    }

}