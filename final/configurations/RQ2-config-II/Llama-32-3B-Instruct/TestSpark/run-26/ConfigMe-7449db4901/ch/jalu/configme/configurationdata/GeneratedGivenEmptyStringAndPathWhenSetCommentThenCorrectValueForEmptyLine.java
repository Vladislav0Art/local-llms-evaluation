package ch.jalu.configme.configurationdata;

public class GeneratedGivenEmptyStringAndPathWhenSetCommentThenCorrectValueForEmptyLine {

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
    public void givenEmptyStringAndPathWhenSetCommentThenCorrectValueForEmptyLine() {
        String path = "path";
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(map);
        commentsConfiguration.setComment(path, "");
        assertEquals(Collections.singletonList(""), commentsConfiguration.getAllComments().get(path));
    }

}