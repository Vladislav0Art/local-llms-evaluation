package org.traccar.protocol;

public class GeneratedDecodeChecksumTest {

    @Test
    public void decodeChecksumTest() {
        ByteBuf buf = new Unpooled().encode("1234567890");
        assertTrue(PatternBuilder.isChecksum(buf) == false);
    }

}