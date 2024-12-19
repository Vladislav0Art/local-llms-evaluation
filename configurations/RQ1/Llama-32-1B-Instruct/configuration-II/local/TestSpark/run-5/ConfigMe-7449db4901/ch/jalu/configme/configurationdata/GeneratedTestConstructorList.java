package ch.jalu.configme.configurationdata;

public class GeneratedTestConstructorList {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        settingsHolder = mock(SettingsHolder.class);
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testConstructorList() {
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList(commentLines));
        commentsConfiguration.setComment("path1", commentLines);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}