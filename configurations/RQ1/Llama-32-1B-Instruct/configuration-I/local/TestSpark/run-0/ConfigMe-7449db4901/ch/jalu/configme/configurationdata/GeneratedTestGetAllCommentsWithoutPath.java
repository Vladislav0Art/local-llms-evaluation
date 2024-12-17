package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsWithoutPath {

    private CommentsConfiguration subject;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        SettingsHolder settingsHolder = new SettingsHolder();
        Map<String, List<String>> commentsMap = Collections.singletonMap("path1", Arrays.asList("line1\n", "line2"));
        subject = new CommentsConfiguration(settingsHolder.registerComments(commentsMap));
    }

    @Test
    public void testGetAllCommentsWithoutPath() {
        String path = "";
        Map<String, List<String>> expectedCommentsMap = Collections.emptyMap();
        subject.setComment(path, commentLines);
        Assertions.assertEquals(expectedCommentsMap, subject.getAllComments().get(path));
    }

}