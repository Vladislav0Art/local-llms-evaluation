package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments_EmptyPath {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testGetAllComments_EmptyPath() throws Exception {
        String path = "";
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put(path, Collections.emptyList());
        commentsConfiguration.setComment(path, commentLines -> Arrays.asList(commentLines));
        Assertions.assertEquals(commentsMap.get(path), commentsConfiguration.getAllComments().get(path));
    }

}