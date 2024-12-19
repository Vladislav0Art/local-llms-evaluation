package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestMockProtocol {

    public boolean decode(TestService testService, int length, byte[] buffer) {
        return true;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class MockGt06Protocol implements MockProtocol {
    @Override
    public boolean decode(TestService testService, int length, byte[] buffer) {
        if (length == 10) {
            System.out.println("Mock Protocol - decode TestService");
            return true;
        } else {
            System.out.println("Mock Protocol - decode TestService: unexpected length " + length);
            return false;
        }
    }

    @Override
    public void setLength(int length) {
        if (length >= 10 && length <= 50) {
            this.length = length;
            System.out.println("MockGt06Protocol - setLength: valid range");
        } else {
            System.out.println("MockGt06Protocol - setLength: invalid range");
        }
    }
}

class MockService {
    private final MockProtocol protocol;

    public MockService(MockProtocol protocol) {
        this.protocol = protocol;
    }

    public String getSatellitesCount(int satellites) {
        return protocol.decode(this, 10, "s" + satellites);
    }
}

class MainTest {

    @Test
    public void testMockProtocol() throws Exception {
        MockGt06Protocol mockProtocol = new MockGt06Protocol();
        MockService mockService = new MockService(mockProtocol);

        String result1 = mockProtocol.decode(mockService, 10, "s" + "1");
        System.out.println("Mock Protocol - decode TestService: result1=" + result1);

        int length = 15;
        mockProtocol.setLength(length);
        System.out.println("MockGt06Protocol - setLength: length=" + length);

        String result2 = mockProtocol.decode(mockService, 5, "s" + "2");
        System.out.println("Mock Protocol - decode TestService: result2=" + result2);

        int length2 = 20;
        mockProtocol.setLength(length2);
        System.out.println("MockGt06Protocol - setLength: length=" + length2);

        String result3 = mockProtocol.decode(mockService, 30, "s" + "3");
        System.out.println("Mock Protocol - decode TestService: result3=" + result3);
    }

}