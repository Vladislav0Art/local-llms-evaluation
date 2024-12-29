package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import org.traccar.helper.Checksum;
import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedDecodeGps_MockChannel {

    @Test
    public void decodeGps_MockChannel() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);
        decoder.setChannel(channel);
        decoder.decode(remoteAddress, (byte[]) null, msg);
    }

}