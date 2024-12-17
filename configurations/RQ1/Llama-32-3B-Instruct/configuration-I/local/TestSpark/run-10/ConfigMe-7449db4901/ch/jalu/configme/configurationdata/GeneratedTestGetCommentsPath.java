package ch.jalu.configme.configurationdata;

public class GeneratedTestGetCommentsPath {

    @Test
    public void testGetCommentsPath() {
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("path", Arrays.asList("comment3"));
        Map map = (Map) commentsConfiguration.get("path");
        assertEquals(1, ((List) map).size());
    }

}