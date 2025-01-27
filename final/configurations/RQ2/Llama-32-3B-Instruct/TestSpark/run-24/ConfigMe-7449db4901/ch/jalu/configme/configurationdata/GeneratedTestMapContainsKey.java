package ch.jalu.configme.configurationdata;

public class GeneratedTestMapContainsKey {

    @Test
    public void testMapContainsKey() {
        String key = "key";
        Map<String, List<String>> map = new HashMap<>();
        map.put(key, Arrays.asList("value"));
        assertTrue(map.containsKey(key));
    }
}

}