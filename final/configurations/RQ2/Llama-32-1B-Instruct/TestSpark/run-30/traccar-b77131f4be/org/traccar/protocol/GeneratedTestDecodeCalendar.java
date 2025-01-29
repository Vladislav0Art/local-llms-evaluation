package org.traccar.protocol;

public class GeneratedTestDecodeCalendar {

    @Test
    public void testDecodeCalendar() {
        Calendar calendar = Calendar.getInstance();
        byte[] bytes = ByteBufUtil.toBytes(calendar.getTime());
        Object decodedCalendar = GalileoProtocolDecoder.decode(bytes, null, null);
        assertNotNull(decodedCalendar);
    }

}