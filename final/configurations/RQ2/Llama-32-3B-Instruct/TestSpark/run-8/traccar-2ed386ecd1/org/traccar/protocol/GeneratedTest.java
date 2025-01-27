package org.traccar.protocol;

public class GeneratedTest {

    public static public static ByteBuf empty() {
        return new ByteBuf(0);
    }

    public static public static ByteBuf allocate(int size) {
        return new ByteBuf(size);
    }
}

public class Test {

    @Test
    public void decodeGps_WithoutPosition_ReturnsFalse() {
        boolean result = Gt06ProtocolDecoder.decodeGps(null, null, false, false, false, null);
        assertFalse(result);
    }

}