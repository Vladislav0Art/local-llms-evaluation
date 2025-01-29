package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_Galileo_Mapping {

    public static final String MSG = "Hello, world!";
    public static final Protocol PROTOCOL = new Protocol();

    @Test
    public void testDecode_Galileo_Mapping() throws Exception {
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(PROTOCOL);
        Map<String, Object> mapping = new HashMap<>();
        mapping.put("key1", "value1");
        Object decoded = decoder.decode("192.168.1.100:1234", SocketAddress.IPv4, mapping);
        assertNotNull(decoded);
        assertEquals(mapping, (Map<String, Object>) decoded);
    }

}