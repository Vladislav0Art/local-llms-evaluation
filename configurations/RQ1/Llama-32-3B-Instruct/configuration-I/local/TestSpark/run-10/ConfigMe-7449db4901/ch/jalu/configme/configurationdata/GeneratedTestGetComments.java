package ch.jalu.configme.configurationdata;

public class GeneratedTestGetComments {

    @Test
    public void testGetComments() {
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("path1", Arrays.asList("comment1", "comment2"));
        Map map = (Map) commentsConfiguration.get("path1");
        assertEquals(2, ((List) map).size());
    }

}