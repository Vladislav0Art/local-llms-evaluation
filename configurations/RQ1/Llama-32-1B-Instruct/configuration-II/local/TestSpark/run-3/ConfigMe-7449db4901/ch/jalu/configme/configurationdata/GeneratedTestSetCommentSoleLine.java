package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentSoleLine {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1\n", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
    }

    @Test
    public void testSetCommentSoleLine() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Collections.singletonList("comment1\n"));
        commentsConfiguration.setComment("path1", "comment2");
        assertEquals(Arrays.asList("comment1\n"), commentsConfiguration.getAllComments().get("path1"));
    }

}