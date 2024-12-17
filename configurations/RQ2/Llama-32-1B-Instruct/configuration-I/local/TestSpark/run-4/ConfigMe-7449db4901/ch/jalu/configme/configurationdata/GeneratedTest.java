package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration config;

    @Before
    public void setup() {
        // Initialize the mock map here (not applicable in this case)
    }

    @Test
    public void comments_configuration_constructor_emptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "test";
        config = new CommentsConfiguration(comments);

        Assertions.assertTrue(config.setComment(path, "").isEmpty());
        Assertions.assertTrue(config.getAllComments().containsKey(path));
    }

    @Test
    public void comments_configuration_constructor_singleLineComment() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "test";
        config = new CommentsConfiguration(comments);

        String commentLines[] = {"Hello"};
        config.setComment(path, "" + Arrays.stream(commentLines).collect(Collectors.joining("\n")));

        Assertions.assertTrue(config.getAllComments().containsKey(path));
    }

    @Test
    public void comments_configuration_constructor_multipleLineComment() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "test";
        config = new CommentsConfiguration(comments);

        String commentLines[] = {"Hello\nWorld"};
        config.setComment(path, Arrays.toString(commentLines));

        Assertions.assertTrue(config.getAllComments().containsKey(path));
    }

    @Test
    public void comments_configuration_setComment_noExistingLine() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "test";
        config = new CommentsConfiguration(comments);

        String commentLines[] = {"Hello", ""};
        config.setComment(path, Arrays.toString(commentLines));

        Assertions.assertTrue(config.getAllComments().containsKey(path));
    }

    @Test
    public void comments_configuration_getAllComments_noExistingLine() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "test";
        config = new CommentsConfiguration(comments);

        Assertions.assertFalse(config.getAllComments().containsKey(path));
    }

}