package ch.jalu.configme.configurationdata;

public class GeneratedWhenGetAllComments_thenReturnEmptyMapIfNoCommentsAreSet {

    private static final String PATH = "path";

    @Test
    public void whenGetAllComments_thenReturnEmptyMapIfNoCommentsAreSet() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> expectedMap = Collections.emptyMap();
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

}