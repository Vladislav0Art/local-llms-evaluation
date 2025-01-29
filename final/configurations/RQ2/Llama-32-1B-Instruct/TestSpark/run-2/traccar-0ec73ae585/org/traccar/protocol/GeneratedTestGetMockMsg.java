package org.traccar.protocol;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetMockMsg {

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
    public void testGetMockMsg() {
        MockMsgFactory factory = new MockMsgFactory();
        MockMsg msg = factory.getMockMsg("test");
        assertNotNull(msg);
        assertEquals("test", msg.getMsg());
    }

}