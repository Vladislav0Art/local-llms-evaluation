package ch.jalu.configme.configurationdata;

public class GeneratedTestMap {

    @Test
    public void testMap() {
        TestMap map = new TestMap();
        map.map.put("key1", "value1");
        assertEquals("value1", map.map.get("key1"));
    }

}