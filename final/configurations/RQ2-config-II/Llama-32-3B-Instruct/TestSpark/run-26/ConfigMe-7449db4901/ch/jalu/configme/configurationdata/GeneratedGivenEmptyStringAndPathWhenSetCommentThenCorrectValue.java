package ch.jalu.configme.configurationdata;

public class GeneratedGivenEmptyStringAndPathWhenSetCommentThenCorrectValue {

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
    public void givenEmptyStringAndPathWhenSetCommentThenCorrectValue() {
        String path = "path";
        String[] commentLines = {" line1 ", " line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put(path, Arrays.asList(commentLines));
        commentsConfiguration = new CommentsConfiguration(map);
        commentsConfiguration.setComment(path, "");
        assertEquals(Arrays.asList(), commentsConfiguration.getAllComments().get(path));
    }

}