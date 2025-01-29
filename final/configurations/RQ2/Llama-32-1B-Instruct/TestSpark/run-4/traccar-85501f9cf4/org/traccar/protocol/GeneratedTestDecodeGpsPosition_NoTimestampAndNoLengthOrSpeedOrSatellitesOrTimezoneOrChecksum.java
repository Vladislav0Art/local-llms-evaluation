package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezoneOrChecksum {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezoneOrChecksum() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT")), Checksum.CHECKSUM_NONE));
    }

}