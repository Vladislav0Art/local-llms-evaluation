package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestDecode {

    public String decode(TestService testService, int length) {
        return "Mock Protocol - decode TestService: result" + (length == 10 ? 1 : 0);
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class MockGt06Protocol implements MockProtocol {
    @Override
    public boolean decode(TestService testService, int length, byte[] buffer) {
        if (length == 10) {
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

    public String getSatellitesCount(int satellites) {
        return decode(this, 10, "s" + satellites);
    }
}

class MockService {
    private final MockProtocol protocol;

    public MockService(MockProtocol protocol) {
        this.protocol = protocol;
    }

    @Test
    public void testDecode() {
        String result1 = protocol.decode(this, 10);
        System.out.println(result1);

        int length = 5;
        String result2 = protocol.decode(this, length);
        System.out.println(result2);

        setLength(30);
        System.out.println(protocol.decode(this, 30));

        String satellitesCount = "s4";
        String result3 = protocol.getSatellitesCount(Integer.parseInt(satellitesCount));
        System.out.println(result3);
    }
}

public class Test {
    public static void main(String[] args) {
        MockProtocol protocol = new MockProtocol();
        MockService service = new MockService(protocol);

        int length = 5;
        String result2 = service.getSatellitesCount(length);
        System.out.println(result2);

        service.setLength(30);
        String satellitesCount = "s4";
        String result3 = service.getSatellitesCount(Integer.parseInt(satellitesCount));
        System.out.println(result3);
    }

}