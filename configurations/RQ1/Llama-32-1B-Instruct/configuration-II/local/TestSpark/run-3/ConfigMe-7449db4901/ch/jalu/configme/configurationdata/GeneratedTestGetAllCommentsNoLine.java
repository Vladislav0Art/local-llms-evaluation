package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsNoLine {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1\n", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
    }

    @Test
    public void testGetAllCommentsNoLine() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Collections.singletonList(""));
        commentsConfiguration.setComment("path1", Arrays.asList("comment2"));
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path1"));
    }

}