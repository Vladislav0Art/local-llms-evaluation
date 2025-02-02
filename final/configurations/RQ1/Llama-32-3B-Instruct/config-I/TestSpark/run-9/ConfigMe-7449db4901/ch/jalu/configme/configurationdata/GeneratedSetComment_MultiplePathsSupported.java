package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_MultiplePathsSupported {

    @Test
    public void setComment_MultiplePathsSupported() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String line1 = "line1";
        String path2 = "path2";
        String line2 = "line2";
        commentsConfiguration.setComment(path1, line1);
        commentsConfiguration.setComment(path2, line2);
        Map<String, List<String>> commentLines = commentsConfiguration.getComments();
        assertEquals(2, commentLines.size());
    }

}