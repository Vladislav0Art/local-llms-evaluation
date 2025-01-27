package ch.jalu.configme.configurationdata;

public class GeneratedTestMapInitWithArrays {

    @Test
    public void testMapInitWithArrays() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key1", Arrays.asList("value1"));
        map.put("key2", Arrays.asList("value2"));
        // No errors here
    }

}