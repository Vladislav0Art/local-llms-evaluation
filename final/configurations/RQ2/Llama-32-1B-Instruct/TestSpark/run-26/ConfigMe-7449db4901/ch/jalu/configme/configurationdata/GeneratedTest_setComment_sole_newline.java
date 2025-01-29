package ch.jalu.configme.configurationdata;

public class GeneratedTest_setComment_sole_newline {

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
    public void test_setComment_sole_newline() {
        String path = configMePath;
        commentsConfiguration.setComment(path, "");
        assertEquals(2, commentsConfiguration.getAllComments().size());
        // Verify comment lines are correct
        for (String comment : comments.get(configMePath)) {
            assert (comment.equals(""));
            assert (!comment.equals("This is the first line of comment"));
            assert (comment.equals("This is an empty line"));
        }
    }

}