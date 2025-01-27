package ch.jalu.configme.configurationdata;

public class GeneratedTestEquals {

    @Test
    public void testEquals() throws Exception {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("commentLine1"));
        assertTrue(!commentsMap.equals(new HashMap<>()));
    }
}

}