package ch.jalu.configme.configurationdata;

public class GeneratedTestEqualMap {

    @Mock
    private SettingsHolder settingsHolderMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEqualMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> commentMap = commentsConfiguration.getCommentsMap();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        commentMap.put("path2", Arrays.asList("commentLine2"));

        assertEquals(commentMap, new HashMap<>(commentMap));
    }

}