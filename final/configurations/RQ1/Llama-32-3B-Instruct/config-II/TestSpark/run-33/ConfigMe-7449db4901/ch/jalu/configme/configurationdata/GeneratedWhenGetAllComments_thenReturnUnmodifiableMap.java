package ch.jalu.configme.configurationdata;

public class GeneratedWhenGetAllComments_thenReturnUnmodifiableMap {

    private static final String PATH = "path";

    @Test
    public void whenGetAllComments_thenReturnUnmodifiableMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("line1", "line2");
        commentsConfig.setComment(PATH, commentLines);
        Map<String, @UnmodifiableView List<String>> expectedMap = Collections.unmodifiableMap(Collections.singletonMap(PATH, commentLines));
        assertEquals(expectedMap, commentsConfig.getAllComments());
    }

}