package ch.jalu.configme.configurationdata;

public class GeneratedGivenNoPathAndExistingCommentLinesWhenSetCommentThenCorrectValue {

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
    public void givenNoPathAndExistingCommentLinesWhenSetCommentThenCorrectValue() {
        String[] commentLines = {"line1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration.setComment("", Arrays.asList(commentLines));
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(""));
    }

}