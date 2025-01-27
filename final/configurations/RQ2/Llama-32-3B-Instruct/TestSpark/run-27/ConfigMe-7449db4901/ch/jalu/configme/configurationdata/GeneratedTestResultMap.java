package ch.jalu.configme.configurationdata;

public class GeneratedTestResultMap {

    private Map<String, Object> map;
    private Map<String, Object> resultMap;

    public void init() {
        this.map = null;
        this.resultMap = null;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public boolean testMap() {
        return map == null || map.isEmpty();
    }

    public boolean testResultMap() {
        return resultMap == null || resultMap.isEmpty();
    }

    public int assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + ", but got " + actual);
        }
        return expected;
    }

    public int testResultMapSize() {
        return resultMap == null ? 0 : resultMap.size();
    }

    public boolean assertMapEmpty() {
        return map == null || map.isEmpty();
    }

    public boolean assertResultMapNotEmty() {
        return resultMap != null && !resultMap.isEmpty();
    }
}

public class GeneratedTest {

    private SettingsHolder settingsHolder;

    @Before
    public void setup() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("key2", "value2");

        settingsHolder = new SettingsHolder();
        settingsHolder.init();
        settingsHolder.setMap(map);
        settingsHolder.setResultMap(resultMap);
    }

    @Test
    public void testResultMap() {
        assertTrue(settingsHolder.testResultMap());
    }

}