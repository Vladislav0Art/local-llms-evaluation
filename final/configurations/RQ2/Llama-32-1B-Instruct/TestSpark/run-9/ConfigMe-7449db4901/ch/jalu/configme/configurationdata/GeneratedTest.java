package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetComment_SimpleCase() throws Exception {
        String path = "path";
        String[] commentLines = {"line1", "", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_SingleLine() throws Exception {
        String path = "path";
        String[] commentLines = {"line1"};
        commentsConfiguration.setComment(path, commentLines[0]);
        Assertions.assertEquals(Arrays.asList(new ArrayList<>(), commentLines), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_MultipleLines() throws Exception {
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testSetComment_EmptyLine() throws Exception {
        String path = "path";
        String[] commentLines = {"", ""};
        commentsConfiguration.setComment(path, commentLines[0]);
        Assertions.assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testGetAllComments_SimpleCase() throws Exception {
        String path = "path";
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put(path, Collections.singletonList("line1"));
        commentsConfiguration.setComment(path, commentLines -> Arrays.asList(commentLines));
        Assertions.assertEquals(commentsMap.get(path), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void testGetAllComments_SingleLine() throws Exception {
        String path = "path";
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put(path, Collections.singletonList("line1"));
        commentsConfiguration.setComment(path, commentLines -> Arrays.asList(commentLines));
        Assertions.assertEquals(commentsMap.get(path), commentsConfiguration.getAllComments().get(path));
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

    @Test
    public void testGetAllComments_EmptyPath() throws Exception {
        String path = "";
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put(path, Collections.emptyList());
        commentsConfiguration.setComment(path, commentLines -> Arrays.asList(commentLines));
        Assertions.assertEquals(commentsMap.get(path), commentsConfiguration.getAllComments().get(path));
    }

}