package ch.jalu.configme.configurationdata;

public class GeneratedWhenSetMultipleComments_ThenMultiplePathsAreAddedToMap {

    private static final String PATH = "path";

    @Test
    public void whenSetMultipleComments_ThenMultiplePathsAreAddedToMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLine1 = Arrays.asList("line1");
        List<String> commentLine2 = Collections.singletonList("\n");
        commentsConfig.setComment(PATH, commentLine1);
        commentsConfig.setComment(PATH + "1", commentLine2);
        assertEquals(2, commentsConfig.comments.size());
        assertTrue(commentsConfig.comments.containsKey(PATH));
        assertTrue(commentsConfig.comments.containsKey(PATH + "1"));
    }

}