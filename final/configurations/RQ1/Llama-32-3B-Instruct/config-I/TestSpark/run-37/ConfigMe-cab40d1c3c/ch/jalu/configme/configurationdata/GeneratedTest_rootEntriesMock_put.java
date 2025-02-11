package ch.jalu.configme.configurationdata;

public class GeneratedTest_rootEntriesMock_put {

    @Test
    public void test_rootEntriesMock_put() throws Exception {
        RootEntriesMock rootEntriesMock = new RootEntriesMock();
        Map<String, Object> expectedMap = Collections.singletonMap("key", "value");
        Map<String, Object> map = new HashMap<>();
        map.putAll(rootEntriesMock.getMap());
        assertEquals(expectedMap, map);
    }

}