package ch.jalu.configme.configurationdata;

public class GeneratedWhenSetMultipleComments_ThenSingleEmptyLineForPathIsAddedToMap {

    private static final String PATH = "path";

    @Test
    public void whenSetMultipleComments_ThenSingleEmptyLineForPathIsAddedToMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("\n", "line2");
        commentsConfig.setComment(PATH, commentLines);
        assertEquals(1, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey(PATH));
    }

}