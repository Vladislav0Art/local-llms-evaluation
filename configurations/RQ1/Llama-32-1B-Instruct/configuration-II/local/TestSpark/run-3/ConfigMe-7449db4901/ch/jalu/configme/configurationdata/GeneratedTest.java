package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1\n", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
    }

    @Test
    public void testSetComment() {
        commentsConfiguration.setComment("path1", "comment3");
        assertEquals(Arrays.asList("comment3\n"), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void testGetAllComments() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        commentsConfiguration.setComment("path1", Collections.singletonList("comment2"));
        assertEquals(Arrays.asList("comment2"), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void testSetCommentSoleLine() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Collections.singletonList("comment1\n"));
        commentsConfiguration.setComment("path1", "comment2");
        assertEquals(Arrays.asList("comment1\n"), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void testGetAllCommentsSoleLine() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Collections.singletonList("comment1\n"));
        commentsConfiguration.setComment("path1", "comment2");
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void testGetAllCommentsNoLine() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Collections.singletonList(""));
        commentsConfiguration.setComment("path1", Arrays.asList("comment2"));
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void testGetAllCommentsNoPath() {
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments());
    }

}