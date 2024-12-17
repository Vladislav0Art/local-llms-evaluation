package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    private CommentsConfiguration subject;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        SettingsHolder settingsHolder = new SettingsHolder();
        Map<String, List<String>> commentsMap = Collections.singletonMap("path1", Arrays.asList("line1\n", "line2"));
        subject = new CommentsConfiguration(settingsHolder.registerComments(commentsMap));
    }

    @Test
    public void testGetAllComments() {
        String path = "path1";
        List<String> commentLines = Arrays.asList("line1", "line2");
        Map<String, List<String>> expectedCommentsMap = Collections.singletonMap("path1", commentLines);
        subject.setComment(path, commentLines);
        Assertions.assertEquals(expectedCommentsMap, subject.getAllComments().get(path));
    }

}