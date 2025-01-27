package ch.jalu.configme.configurationdata;

public class GeneratedTestMapInitWithHashMap {

    @Test
    public void testMapInitWithHashMap() {
        Map<String, Map<String, String>> map = new HashMap<>();
        Map<String, String> innerMap = new HashMap<>();
        innerMap.put("innerKey1", "value11");
        innerMap.put("innerKey2", "value12");
        map.put("key1", innerMap);
        // No errors here
    }
}

}