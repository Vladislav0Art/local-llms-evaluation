package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.Protocol;
import org.traccar.Context;
import org.traccar.protocol.ProtocolDecoderTest;
import org.traccar.model.Position;
import org.traccar.helper.TestIdentityManager;
import org.traccar.model.Network;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeInvalidData {

    @Test
    public void decodeInvalidData() throws Exception {
        Context.init(new TestIdentityManager());
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        ByteBuf buf = Unpooled.copiedBuffer("[3G*123456*0007*XX]", StandardCharsets.US_ASCII);
        Position position = decoder.decode(null, null, buf);
        assertNull(position);
    }

}