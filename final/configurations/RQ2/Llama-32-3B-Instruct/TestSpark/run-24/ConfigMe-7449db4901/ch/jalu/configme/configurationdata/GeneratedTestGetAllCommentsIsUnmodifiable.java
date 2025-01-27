package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsIsUnmodifiable {

    @Test
    public void testGetAllCommentsIsUnmodifiable() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("comment"));
        assertTrue(commentsConfiguration.getAllComments().isUnmodifiable());
    }

}