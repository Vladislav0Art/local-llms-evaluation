package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.junit.jupiter.api.Test;

public class GeneratedTestDecode_GalileoProtocolMessage_06 {

    public static final int SCENE_NAME = 1; // Scenario Name
    public static final String MSG_TYPE = "GalileoProtocolMessage"; // Message Type

    @Test
    public void testDecode_GalileoProtocolMessage_06() throws Exception {
        byte[] bytes = new byte[4];
        System.arraycopy(new byte[]{0x00, 0x02}, 0, bytes, 0, 2);
        ByteBufUtil.copyFromBytes(bytes, 0, bytes.length);

        Object result = GalileoProtocolDecoder.decodeChannel(channel(), remoteAddress(), msg -> {
            byte[] messageBytes = (byte[]) msg;
            if (messageBytes[1] == SCENE_NAME) {
                throw new Exception("Invalid galileo protocol message");
            } else {
                return null;
            }
        }, bytes);

        assertEquals(4, result.length);
    }

}