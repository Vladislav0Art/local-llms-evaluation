package org.traccar.protocol;

public class GeneratedTestGetHasIndex_Watch_Scenario2 {

    private byte[] buffer;

    public static ByteBuf copiedBuffer(String str, int length) {
        byte[] bytes = str.getBytes();
        if (bytes.length > length) {
            throw new IllegalArgumentException("Bytes length must be less than or equal to specified length");
        }
        return new ByteBuf(bytes);
    }

    private ByteBuf(byte[] buffer) {
        this.buffer = buffer;
    }

    public int remaining() {
        for (int i = 0; i < buffer.length - 1; i++) {
            if (buffer[i] == 0) {
                return buffer.length - i - 1;
            }
        }
        return 0;
    }
}

public class Protocol {
    public static final byte WATCH = 1;
}

public class GeneratedTest {

    @Test
    public void testGetHasIndex_Watch_Scenario2() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecorator();

        // Act and Assert
        assertTrue(decoder.getHasIndex());
    }
}

public class WatchProtocolDecorator extends WatchProtocolDecoder {

    private boolean hasIndex = false;

    @Override
    public boolean decode(ByteBuf buf) {
        this.hasIndex = true;
        return super.decode(buf);
    }

    @Override
    public boolean getHasIndex() {
        return hasIndex;
    }

}