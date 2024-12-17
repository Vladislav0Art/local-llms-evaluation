package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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

    @Test
    public void testSetCommentWithEmptyLine() {
        String path = "path1";
        List<String> commentLines = Arrays.asList("line1", "");
        subject.setComment(path, commentLines);
        Assertions.assertEquals(Collections.emptyList(), subject.getAllComments().get(path));
    }

    @Test
    public void testGetAllComments() {
        String path = "path1";
        List<String> commentLines = Arrays.asList("line1", "line2");
        Map<String, List<String>> expectedCommentsMap = Collections.singletonMap("path1", commentLines);
        subject.setComment(path, commentLines);
        Assertions.assertEquals(expectedCommentsMap, subject.getAllComments().get(path));
    }

    @Test
    public void testGetAllCommentsWithoutPath() {
        String path = "";
        Map<String, List<String>> expectedCommentsMap = Collections.emptyMap();
        subject.setComment(path, commentLines);
        Assertions.assertEquals(expectedCommentsMap, subject.getAllComments().get(path));
    }

}