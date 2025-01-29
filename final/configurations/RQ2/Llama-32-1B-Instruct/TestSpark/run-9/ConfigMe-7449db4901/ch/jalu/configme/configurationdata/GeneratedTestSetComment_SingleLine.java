package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment_SingleLine {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetComment_SingleLine() throws Exception {
        String path = "path";
        String[] commentLines = {"line1"};
        commentsConfiguration.setComment(path, commentLines[0]);
        Assertions.assertEquals(Arrays.asList(new ArrayList<>(), commentLines), commentsConfiguration.getAllComments().get(path));
    }

}