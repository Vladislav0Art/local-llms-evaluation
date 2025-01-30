package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Model;
import org.traccar.ProtocolTest;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeCompressedPositionsTest {

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        Protocol protocol = new GalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        protocol.addServer(new NetworkMessage(ByteBufUtil.decodeHexDump("01f866f38142002400010465000c2b010041080969006901515004511800000006870004dbdc000530000000000000637400000000000000000000"), remoteAddress));

        Integer decodedTag = decoder.decodeCompressedPositions(null, remoteAddress, ByteBufUtil.decodeHexDump("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
        assertEquals(null, decodedTag);
    }

}