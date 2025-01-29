package org.traccar.protocol;

public class GeneratedTestDecodeUnits {

    @Test
    public void testDecodeUnits() {
        String units = "m";
        byte[] bytes = ByteBufUtil.toBytes("Hello".getBytes(StandardCharsets.UTF_8));
        Object decodedUnits = GalileoProtocolDecoder.decode(bytes, null, null);
        assertEquals(units, (String) decodedUnits);
    }

}