package ch.jalu.configme.configurationdata;

public class GeneratedWhenSetComment_thenReturnPathAndCommentLinesAreAddedToMap {

    private static final String PATH = "path";

    @Test
    public void whenSetComment_thenReturnPathAndCommentLinesAreAddedToMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("line1", "line2");
        commentsConfig.setComment(PATH, commentLines);
        assertEquals(1, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey(PATH));
    }

}