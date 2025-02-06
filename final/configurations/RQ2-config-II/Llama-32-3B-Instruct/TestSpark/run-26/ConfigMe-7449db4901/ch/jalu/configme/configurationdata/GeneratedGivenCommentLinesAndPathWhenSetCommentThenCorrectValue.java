package ch.jalu.configme.configurationdata;

public class GeneratedGivenCommentLinesAndPathWhenSetCommentThenCorrectValue {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        commentLines(map);
        commentsConfiguration = new CommentsConfiguration(map);
    }

    public void commentLines(Map<String, List<String>> map) {
        map.put("path", Arrays.asList("line1", "line2"));
    }

    @Test
    public void givenCommentLinesAndPathWhenSetCommentThenCorrectValue() {
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put(path, Arrays.asList(commentLines));
        commentsConfiguration = new CommentsConfiguration(map);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList("line1", "line2"), commentsConfiguration.getAllComments().get(path));
    }

}