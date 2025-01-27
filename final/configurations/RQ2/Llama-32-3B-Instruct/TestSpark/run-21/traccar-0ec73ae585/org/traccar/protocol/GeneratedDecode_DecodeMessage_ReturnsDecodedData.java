package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_DecodeMessage_ReturnsDecodedData {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decode_DecodeMessage_ReturnsDecodedData() throws Exception {
        byte[] data = {0x01, 0x02, 0x03};
        ByteBuf buffer = Unpooled.buffer(data.length);
        BufferUtil.copyBuffer(buffer, data);
        Object result = watchProtocolDecoder.decode(null, null, networkMessage);
        assertEquals(deviceSession, result);
    }

}