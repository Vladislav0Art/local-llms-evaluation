package ch.jalu.configme.configurationdata;

public class GeneratedTestHashMap {

    @Test
    public void testHashMap() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        assertEquals(1, commentMap.size());
        assertTrue(!Arrays.equals(Arrays.asList(commentMap.get("path1")), Arrays.asList(commentMap.get("path1"))));
    }
}

}