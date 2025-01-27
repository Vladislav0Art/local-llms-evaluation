package ch.jalu.configme.configurationdata;

public class GeneratedTestSetAndGetComment {

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetAndGetComment() {
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        commentsConfiguration.setComment("path", commentLines);
        assertEquals(commentLines, commentsConfiguration.getComment("path"));
    }

}