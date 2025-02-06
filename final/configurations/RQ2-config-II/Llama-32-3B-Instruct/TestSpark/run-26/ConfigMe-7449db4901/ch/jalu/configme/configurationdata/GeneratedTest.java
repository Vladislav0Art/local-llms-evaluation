package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void givenMapWhenNewInstanceThenCorrectInstance() {
        Map<String, List<String>> map = new HashMap<>();
        commentLines(map);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertNotNull(commentsConfiguration);
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

    @Test
    public void givenEmptyStringAndPathWhenSetCommentThenCorrectValueForEmptyLine() {
        String path = "path";
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(map);
        commentsConfiguration.setComment(path, "");
        assertEquals(Collections.singletonList(""), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void givenNoPathWhenSetCommentThenCorrectValue() {
        String[] commentLines = {"line1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration.setComment("", commentLines);
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(""));
    }

    @Test
    public void givenNoPathAndExistingCommentLinesWhenSetCommentThenCorrectValue() {
        String[] commentLines = {"line1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration.setComment("", Arrays.asList(commentLines));
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(""));
    }

    @Test
    public void givenPathAndExistingMapWhenNewInstanceThenCorrectValue() {
        Map<String, List<String>> map = new HashMap<>();
        commentLines(map);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(map, commentsConfiguration.getAllComments());
    }

    @Test
    public void givenExistingMapWhenNewInstanceThenCorrectValue() {
        Map<String, List<String>> map = new HashMap<>();
        commentLines(map);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(map, commentsConfiguration.getAllComments());
    }

}