package org.traccar.protocol;

import java.nio.charset.StandardCharsets;

public class GeneratedTestDecodeChannel {

    public String getManufacturer() {
        return "My Company";
    }

    public boolean getHasIndex() {
        return false;
    }
}

public class BaseProtocolDecoder {
    protected Protocol protocol;

    public BaseProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    public abstract Object decodeChannel(String channel);

    @Override
    public String toString() {
        return "BaseProtocolDecoder{" +
                "protocol=" + protocol +
                '}';
    }
}

public class WatchProtocolDecoderTest {
    public Protocol protocol;

    public WatchProtocolDecoderTest(Protocol protocol) {
        this.protocol = protocol;
    }

    public String getManufacturer() {
        return protocol.getManufacturer();
    }

    public boolean getHasIndex() {
        return protocol.getHasIndex();
    }

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    public Object decodeChannel(String channel) throws Exception {
        return channel.getBytes(StandardCharsets.UTF_8);
    }

    @Test
    public void testDecodeChannel() {
        String channel = "1234567890abcdef".getBytes(StandardCharsets.UTF_8).toString();

        BaseProtocolDecoder decoder = new BaseProtocolDecoder(protocol);
        Object bytes = decoder.decodeChannel(channel);

        assertEquals(channel, (String) bytes);
    }

}