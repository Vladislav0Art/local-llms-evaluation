package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment_EmptyLine {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetComment_EmptyLine() throws Exception {
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfiguration.setComment(path, commentLines[0]);
        Assertions.assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

}