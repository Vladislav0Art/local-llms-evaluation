package ch.jalu.configme.configurationdata;

public class GeneratedConstructorWithCommentMapTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        commentsConfiguration.setCommentsMap(commentsConfiguration.getCommentsMap());
    }

    @Test
    public void constructorWithCommentMapTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test/path", Arrays.asList("comment line 1", "comment line 2"));
        commentsConfiguration.setCommentsMap(commentMap);
        assertEquals(commentMap, commentsConfiguration.getComments());
    }

}