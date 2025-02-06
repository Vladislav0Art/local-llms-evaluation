package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_throwsNullPointerExceptionForNullPath {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void setComment_throwsNullPointerExceptionForNullPath() {
        // Given:
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String[] commentLines = {"new", "comment"};

        // When and Then:
        assertThrows(NullPointerException.class, () -> commentsConfig.setComment(null, NEWLINE, commentLines));
    }

}