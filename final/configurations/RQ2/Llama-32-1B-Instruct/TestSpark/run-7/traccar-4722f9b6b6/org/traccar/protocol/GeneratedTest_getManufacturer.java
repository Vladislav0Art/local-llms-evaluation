package org.traccar.protocol;

public class GeneratedTest_getManufacturer {

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
    public void test_getManufacturer() throws Exception {
        BaseProtocolDecoder baseProtocolDecoder = new BaseProtocolDecoder();
        String message = "test_message";
        assertEquals(baseProtocolDecoder.getManufacturer(message), Arrays.asList("manufacturer", "getManufacturer"));
    }

}