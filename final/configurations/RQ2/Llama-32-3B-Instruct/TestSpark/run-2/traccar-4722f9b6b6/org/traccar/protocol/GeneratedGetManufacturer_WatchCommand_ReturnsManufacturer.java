package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedGetManufacturer_WatchCommand_ReturnsManufacturer {

    @Test
    public void getManufacturer_WatchCommand_ReturnsManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("Watch"));
        assertEquals("Manufacturer", decoder.getManufacturer());
    }
}

public class MockChannel {
    private Object obj;

    public void set(Object o) {
        obj = o;
    }

    public Object get() {
        return obj;
    }
}

public class PositionParser extends Parser<Position> {

    @Override
    protected Position parse(Pattern pattern, ByteBuf buf, int offset) throws Exception {
        // implementation
    }
}

public class WatchProtocolDecoder {
    private final Protocol protocol;

    public WatchProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        byte[] data = ((NetworkMessage) msg).getData();
        return parse(data);
    }

    private Position parse(byte[] data) throws Exception {
        // implementation
    }

}