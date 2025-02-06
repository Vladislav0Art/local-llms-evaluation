package ch.jalu.configme.configurationdata;

public class GeneratedGivenPathAndExistingMapWhenNewInstanceThenCorrectValue {

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
    public void givenPathAndExistingMapWhenNewInstanceThenCorrectValue() {
        Map<String, List<String>> map = new HashMap<>();
        commentLines(map);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(map, commentsConfiguration.getAllComments());
    }

}