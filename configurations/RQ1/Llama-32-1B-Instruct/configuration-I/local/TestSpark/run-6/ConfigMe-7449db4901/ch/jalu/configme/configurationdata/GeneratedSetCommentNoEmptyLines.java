package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentNoEmptyLines {

    @Test
    public void setCommentNoEmptyLines() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path1";
        String...commentLines = {"line1", "\nline2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

}