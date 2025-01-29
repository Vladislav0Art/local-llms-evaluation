package org.traccar.protocol;

public class GeneratedTest_getHasIndex {

    public String getHasIndex(String msg) throws Exception {
        return "hasIndex".equals(Arrays.asList("hasIndex", "getHasIndex"));
    }

    public String getManufacturer(String msg) throws Exception {
        return "manufacturer".equals(Arrays.asList("manufacturer", "getManufacturer"));
    }
}

public class TestSpark {

    @Before
    public void setUp() {
        BaseProtocolDecoder baseProtocolDecoder = new BaseProtocolDecoder();
    }

    @Test
    public void test_getHasIndex() throws Exception {
        String message = "test_message";
        assertEquals(baseProtocolDecoder.getHasIndex(message), Arrays.asList("hasIndex", "getHasIndex"));
    }

}