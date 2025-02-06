package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_setsMultipleNewlinesAsEmptyLinesWithoutCommentMarkers {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void setComment_setsMultipleNewlinesAsEmptyLinesWithoutCommentMarkers() {
        // Given:
        String path = PATH;
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String[] commentLines = {NEWLINE, NEWLINE, "new", "comment"};
        commentsConfig.setComment(path, NEWLINE, NEWLINE, "new", "comment");

        // When:
        Map<String, List<String>> updatedComments = commentsConfig.getAllComments();

        // Then:
        assertEquals(Arrays.asList(NEWLINE, NEWLINE), updatedComments.get(path));
    }

}