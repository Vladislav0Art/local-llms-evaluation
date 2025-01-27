package ch.jalu.configme.configurationdata;

public class GeneratedTestMapInitWithList {

    @Test
    public void testMapInitWithList() {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        map.put("key", list);
        // No errors here
    }

}