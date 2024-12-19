package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        settingsHolder = mock(SettingsHolder.class);
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetComment() {
        String path = "path1";
        List<String> commentLines = Arrays.asList("comment1");
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

}