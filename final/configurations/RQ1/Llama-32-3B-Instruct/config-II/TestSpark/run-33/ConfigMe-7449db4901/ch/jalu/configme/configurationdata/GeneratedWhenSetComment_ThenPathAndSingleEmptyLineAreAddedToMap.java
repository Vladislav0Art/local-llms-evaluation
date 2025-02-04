package ch.jalu.configme.configurationdata;

public class GeneratedWhenSetComment_ThenPathAndSingleEmptyLineAreAddedToMap {

    private static final String PATH = "path";

    @Test
    public void whenSetComment_ThenPathAndSingleEmptyLineAreAddedToMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Collections.singletonList("\n");
        commentsConfig.setComment(PATH, commentLines);
        assertEquals(1, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey(PATH));
    }

}