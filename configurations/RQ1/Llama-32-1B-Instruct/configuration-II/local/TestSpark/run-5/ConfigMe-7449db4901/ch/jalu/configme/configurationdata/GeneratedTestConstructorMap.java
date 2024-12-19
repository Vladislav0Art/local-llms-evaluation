package ch.jalu.configme.configurationdata;

public class GeneratedTestConstructorMap {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        settingsHolder = mock(SettingsHolder.class);
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testConstructorMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Collections.singletonList("comment2"));
        commentsConfiguration.setComment("path1", "comment1", "comment3");
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

}