package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_SetCommentsForPath {

    @Test
    public void setComment_SetCommentsForPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        List<String> commentLines = commentsConfiguration.getComments().get("path");
        assertEquals(Arrays.asList("line1", "line2"), commentLines);
    }

}