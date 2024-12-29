package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.Channel;
import org.junit.jupiter.api.Test;

public class GeneratedTestDecode_GalileoProtocolMessage_02 {

    public static final int SCENE_NAME = 1; // Scenario Name
    public static final String MSG_TYPE = "GalileoProtocolMessage"; // Message Type

    @Test
    public void testDecode_GalileoProtocolMessage_02() throws Exception {
        byte[] bytes = new byte[5];
        System.arraycopy(new byte[]{0x00, 0x04, 0x05, 0x06, 0x07}, 0, bytes, 0, 4);
        ByteBufUtil.copyFromBytes(bytes, 0, bytes.length);

        Object result = GalileoProtocolDecoder.decodeChannel(channel(), remoteAddress(), msg -> {
            byte[] messageBytes = (byte[]) msg;
            if (messageBytes[1] == SCENE_NAME) {
                return new Position(1, 1.0D);
            } else {
                throw new Exception("Invalid galileo protocol message");
            }
        }, bytes);

        assertEquals(5, result.length);
    }

}