package ch.jalu.configme.configurationdata;

public class GeneratedTestMapGetKey {

    @Test
    public void testMapGetKey() {
        String key = "key";
        Map<String, List<String>> map = new HashMap<>();
        map.put(key, Collections.singletonList("value"));
        assertEquals(key, map.keySet().iterator().next());
    }

}