package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment {

    private CommentsConfiguration subject;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        SettingsHolder settingsHolder = new SettingsHolder();
        Map<String, List<String>> commentsMap = Collections.singletonMap("path1", Arrays.asList("line1\n", "line2"));
        subject = new CommentsConfiguration(settingsHolder.registerComments(commentsMap));
    }

    @Test
    public void testSetComment() {
        String path = "path1";
        List<String> commentLines = Arrays.asList("line1", "line3");
        subject.setComment(path, commentLines);
        Assertions.assertEquals(Arrays.asList(commentLines), subject.getAllComments().get(path));
    }

}