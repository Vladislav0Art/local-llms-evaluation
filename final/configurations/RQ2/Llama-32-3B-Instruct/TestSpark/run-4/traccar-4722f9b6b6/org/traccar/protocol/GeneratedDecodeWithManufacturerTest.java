package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedDecodeWithManufacturerTest {

    public static class WatchProtocolDecoder {
        private boolean hasIndex;

        public WatchProtocolDecoder(Protocol protocol) {
            super(protocol);
        }

        public byte[] decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
            if (hasIndex) {
                return getDecodingResult();
            }
            return new byte[0];
        }

        public boolean getHasIndex() {
            return hasIndex;
        }

        public void setHasIndex(boolean hasIndex) {
            this.hasIndex = hasIndex;
        }

        protected WatchProtocolDecoder.DECODING_RESULT getDecodingResult() {
            // implementation
            return null;
        }
    }

    public static class DECODING_RESULT {
        private int index;

        public DECODING_RESULT(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }

    public interface SocketAddress {
    }

    public class SocketAddressImpl implements SocketAddress {
    }

    public class ChannelImpl implements Channel {
    }

    @Test
    public void decodeWithManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(1);
        buf.writeShort((short) 2);
        String manufacturer = "Test";
        byte[] result = decoder.decode(Mockito.mock(ChannelImpl.class), Mockito.any(SocketAddressImpl.class), null);
        Assert.assertEquals(manufacturer, new String(result).trim());
    }

}