package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment_MultipleLines {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetComment_MultipleLines() throws Exception {
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

}