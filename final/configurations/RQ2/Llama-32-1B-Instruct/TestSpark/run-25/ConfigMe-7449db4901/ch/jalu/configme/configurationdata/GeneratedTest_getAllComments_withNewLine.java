package ch.jalu.configme.configurationdata;

public class GeneratedTest_getAllComments_withNewLine {

    private final Map<String, List<String>> comments;
    private String commentLines;

    @Override
    public void setComment(@NotNull String path, @NotNull String... commentLines) {
        this.commentLines = String.join("\n", Arrays.asList(path, commentLines));
    }

    @Override
    public @NotNull @UnmodifiableView Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.singletonMap("path", this.commentLines);
    }
}

public class CommentsConfigurationTest {

    private CommentsConfigurationImpl commentsConfiguration;

    @Before
    public void setup() {
    }

    @Test
    public void test_getAllComments_withNewLine() throws Exception {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("", ""));
        commentsConfiguration.setComment("path", "comment1\ncomment2");
        Assert.assertTrue(comments.get("path").contains("/\ncomment1"));
    }

}