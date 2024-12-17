package ch.jalu.configme.configurationdata;

public class GeneratedComments_configuration_constructor_singleLineComment {

    private CommentsConfiguration config;

    @Before
    public void setup() {
        // Initialize the mock map here (not applicable in this case)
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

}