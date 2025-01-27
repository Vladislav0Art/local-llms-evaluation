package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Locale;

public class GeneratedTestGetChecksum {

    @Test
    public void testGetChecksum() throws IOException {
        Checksum checksum = new Checksum();
        checksum.calculate(1);
        checksum.calculate(2);
    }
}

public class Gt06ProtocolDecoder {

    public Object decode(Channel channel, SocketAddress socketAddress, Object data) throws IOException {
        // implementation
        return null;
    }

    public static class Channel {
    }

    public static class TraccarProtocolDecoder {

        public Object decode(Channel channel, SocketAddress socketAddress, Object data) throws IOException {
            // implementation
            return null;
        }

        public static class Channel {
        }
    }
}

public class Checksum {

    private long checksum;

    public void calculate(long value) {
        this.checksum += value;
    }

    public void calculate(int value) {
        this.checksum += value;
    }

    public static class Checksum {
    }

    public long getChecksum() {
        return checksum;
    }
}

public class TimeZone {

    private String id;

    public String getDisplayName(java.util.Locale locale, java.util.function.BooleanSupplier lazyTrue) {
        // implementation
        return null;
    }

    public static class TimeZone {
    }

}