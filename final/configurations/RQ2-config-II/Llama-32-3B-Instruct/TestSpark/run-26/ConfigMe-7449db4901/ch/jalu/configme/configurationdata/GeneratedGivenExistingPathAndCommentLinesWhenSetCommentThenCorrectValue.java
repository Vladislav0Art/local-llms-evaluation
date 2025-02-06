package ch.jalu.configme.configurationdata;

public class GeneratedGivenExistingPathAndCommentLinesWhenSetCommentThenCorrectValue {

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
    public void givenExistingPathAndCommentLinesWhenSetCommentThenCorrectValue() {
        String path = "path";
        Map<String, List<String>> map = new HashMap<>();
        map.put(path, Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(map);
        String[] commentLines = {"newLine"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList("newLine"), commentsConfiguration.getAllComments().get(path));
    }

}