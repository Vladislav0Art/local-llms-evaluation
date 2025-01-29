package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments_MultipleLines {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testGetAllComments_MultipleLines() throws Exception {
        String path = "path";
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put(path, Collections.singletonList("line1"));
        commentsMap.put(path, Collections.singletonList("line2"));
        commentsConfiguration.setComment(path, commentLines -> Arrays.asList(commentLines));
        Assertions.assertEquals(commentsMap.get(path), commentsConfiguration.getAllComments().get(path));
    }

}