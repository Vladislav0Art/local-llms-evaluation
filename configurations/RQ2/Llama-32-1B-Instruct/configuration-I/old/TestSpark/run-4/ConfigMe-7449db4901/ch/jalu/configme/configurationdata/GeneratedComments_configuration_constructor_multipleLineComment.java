package ch.jalu.configme.configurationdata;

public class GeneratedComments_configuration_constructor_multipleLineComment {

    private CommentsConfiguration config;

    @Before
    public void setup() {
        // Initialize the mock map here (not applicable in this case)
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

}