package org.traccar.protocol;

public class GeneratedTestDecodeTime {

    @Test
    public void testDecodeTime() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        byte[] bytes = ByteBufUtil.toBytes(calendar.getTime());
        Object decodedTime = GalileoProtocolDecoder.decode(bytes, null, null);
        assertEquals(date, (Date) decodedTime);
    }

}