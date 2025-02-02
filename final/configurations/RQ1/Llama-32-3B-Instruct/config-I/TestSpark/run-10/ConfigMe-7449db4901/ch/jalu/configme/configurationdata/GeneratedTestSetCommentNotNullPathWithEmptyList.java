package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentNotNullPathWithEmptyList {

    private CommentsConfiguration commentsConfiguration;
    private Map<String, List<String>> comments;

    @Before
    public void setup() {
        comments = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(comments);
    }

    public void testConstructor() {
        assert commentsConfiguration.comments.isEmpty();
    }

    public void testConstructorWithMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(map, commentsConfiguration.comments);
    }

    @Test
    public void testSetCommentNotNullPathWithEmptyList() {
        String path = "path";
        String commentLine = "\n";

        commentsConfiguration.setComment(path, commentLine);

        assertEquals(Collections.singletonList(commentLine), commentsConfiguration.comments.get(path));
    }

}