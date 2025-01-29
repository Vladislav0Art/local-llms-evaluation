package org.traccar.protocol;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetMockMsgPort {

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
    private static Map<String, MockMsg> msgMap = new HashMap<>();
    private static Map<String, MockSocketAddress> addrMap = new HashMap<>();

    static {
        msgMap.put("test", new MockMsg());
    }

    public MockMsg getMockMsg(String key) {
        return msgMap.get(key);
    }
}

public class TestMockMsgFactory {

    @Test
    public void testGetMockMsgPort() {
        MockMsgFactory factory = new MockMsgFactory();
        MockSocketAddress addr = new MockSocketAddress();
        addr.setIp("127.0.0.1");
        addr.setPort(8080);
        MockMsgFactory_mocked.port = 8081;
        MockMsgFactory_mocked = getMockMsg("test");
        assertNotNull(addrFactory.getPort());
        assertEquals(8081, addrFactory.getPort().getPort());
    }

}