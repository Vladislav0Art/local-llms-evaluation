package org.traccar.protocol;

public class GeneratedTestGetMockMsgByPort {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

public class MockSocketAddress {
    private String address;
    private int port;
    private String ip;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

public class MockMsgFactory {
    private static final Map<String, String> msgMap = new HashMap<>();
    private static final Map<String, String> addrMap = new HashMap<>();

    static {
        msgMap.put("test", "test");
    }

    public MockMsg getMockMsg(String key) {
        return new MockMsg();
    }
}

public class TestMsgFactory {

    @Test
    public void testGetMockMsgByPort() {
        MockMsg msg = MockMsgFactory.getMockMsg("test");
        assertNotNull(msg);
        MockSocketAddress addr = new MockSocketAddress();
        addr.setIp("127.0.0.1");
        addr.setPort(8080);
        assertEquals("test", addr.getAddress());
    }
}

}