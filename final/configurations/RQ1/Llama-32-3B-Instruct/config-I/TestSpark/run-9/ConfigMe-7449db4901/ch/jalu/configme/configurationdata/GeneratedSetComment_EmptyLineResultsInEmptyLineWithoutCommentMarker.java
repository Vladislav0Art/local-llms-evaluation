package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_EmptyLineResultsInEmptyLineWithoutCommentMarker {

    @Test
    public void setComment_EmptyLineResultsInEmptyLineWithoutCommentMarker() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String line = "\n";
        commentsConfiguration.setComment("path", line, "line2");
        List<String> commentLines = commentsConfiguration.getComments().get("path");
        assertEquals(Arrays.asList("line2"), commentLines);
    }

}