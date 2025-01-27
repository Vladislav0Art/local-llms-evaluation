package ch.jalu.configme.configurationdata;

public class GeneratedTestAssertNotEquals {

    @Test
    public void testAssertNotEquals() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("commentLine1"));
        assertTrue(!Arrays.equals(Arrays.asList(commentMap.get("path1")), Arrays.asList(commentMap.get("path1"))));
    }

}