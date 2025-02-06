package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_throwsNullPointerExceptionForNullCommentLines {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void setComment_throwsNullPointerExceptionForNullCommentLines() {
        // Given:
        String path = PATH;
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // When and Then:
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(path, null));
    }

}