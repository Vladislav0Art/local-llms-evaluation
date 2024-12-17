package ch.jalu.configme.configurationdata;

public class GeneratedTestGetCommentsPath1 {

    @Test
    public void testGetCommentsPath1() {
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        List path1Comments = Arrays.asList("comment4", "comment5");
        List pathComments = Arrays.asList("comment6");
        commentsConfiguration.put("path1", path1Comments);
        commentsConfiguration.put("path", pathComments);
        Map map = (Map) commentsConfiguration.get("path");
        assertEquals(2, ((List) map).size());
    }

}