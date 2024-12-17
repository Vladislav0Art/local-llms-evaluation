package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_multipleLinesShouldAddAllElementsToPath {

    @Mock
    private Map<String, List<String>> commentsMap;

    public static void main(String[] args) {
        CommentsConfigurationTest test = new CommentsConfigurationTest();
    }

    @Test
    public void setComment_multipleLinesShouldAddAllElementsToPath() {
        List<String> lines = new ArrayList<>();
        lines.add("comment1");
        lines.add("comment2");
        commentsConfiguration.setComment("path", "line1", "line2", "comment", "line3", "comment4");
        assertEquals(5, commentsConfiguration.getAllComments().get("path").size());
    }

}