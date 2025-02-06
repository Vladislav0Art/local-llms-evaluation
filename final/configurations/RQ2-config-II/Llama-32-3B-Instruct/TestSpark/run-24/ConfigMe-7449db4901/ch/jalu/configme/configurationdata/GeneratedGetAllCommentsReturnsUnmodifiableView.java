package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsReturnsUnmodifiableView {

    private static final String VALID_COMMENT_LINES = "Comment1\nComment2";
    private static final String EMPTY_COMMENT_LINES = "\n";

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList()));
        Map<String, List<String>> comments = getAllComments();
        assertTrue(comments instanceof UnmodifiableView);
    }

}