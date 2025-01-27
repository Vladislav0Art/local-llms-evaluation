package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Collections.singletonList("comment"));
        commentsMap = map;
        assertTrue(commentsMap.containsKey("key"));
    }

    public Set<String> getAllComments() {
        return commentsMap.keySet();
    }

}