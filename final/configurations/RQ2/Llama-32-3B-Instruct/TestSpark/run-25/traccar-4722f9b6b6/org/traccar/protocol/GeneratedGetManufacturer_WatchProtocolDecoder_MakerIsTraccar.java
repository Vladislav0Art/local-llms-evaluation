package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Command;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedGetManufacturer_WatchProtocolDecoder_MakerIsTraccar {

    @Test
    public void getManufacturer_WatchProtocolDecoder_MakerIsTraccar() {
        // [MethodUnderTest][Scenario]Test
        Protocol protocol = new MockProtocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        assertEquals("Traccar", manufacturer);
    }

}