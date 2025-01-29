package org.traccar.protocol;

public class GeneratedTest {

    protected Protocol protocol;

    public BaseProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public Object decodeChannel(String channel) throws Exception {
        return channel.getBytes(StandardCharsets.UTF_8);
    }
}

public class WatchProtocolDecoder extends BaseProtocolDecoder {

    @Override
    public Object decodeChannel(String channel) throws Exception {
        return channel.getBytes(StandardCharsets.UTF_8);
    }

}