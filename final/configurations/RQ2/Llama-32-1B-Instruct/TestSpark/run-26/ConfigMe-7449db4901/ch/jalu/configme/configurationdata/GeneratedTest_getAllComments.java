package ch.jalu.configme.configurationdata;

public class GeneratedTest_getAllComments {

    private CommentsConfiguration commentsConfiguration;
    private Map<String, List<String>> comments;

    @Before
    public void setup() {
        settingsHolder = new SettingsHolder();
        settingsHolder.set("configme", new HashMap<>());
        String configMePath = System.getProperty("user.dir") + "/test-configme";
        comments = new HashMap<>();
        comments.put(configMePath, Arrays.asList(
                "This is the first line of comment",
                "",
                "This is the second line with a space",
                "This is an empty line"
        ));
    }

    @Test
    public void test_getAllComments() {
        String path = configMePath;
        commentsConfiguration.setComment(path, "This is the first line of comment\nThis is the second line with a space");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path, Arrays.asList(
                "This is the first line of comment",
                "",
                "This is the second line with a space"
        ));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}