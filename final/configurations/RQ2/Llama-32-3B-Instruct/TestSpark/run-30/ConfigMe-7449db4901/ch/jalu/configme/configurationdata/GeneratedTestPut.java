package ch.jalu.configme.configurationdata;

public class GeneratedTestPut {

    @Test
    public void testPut() throws Exception {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("commentLine1"));
        assertEquals(1, commentsMap.size());
    }

}