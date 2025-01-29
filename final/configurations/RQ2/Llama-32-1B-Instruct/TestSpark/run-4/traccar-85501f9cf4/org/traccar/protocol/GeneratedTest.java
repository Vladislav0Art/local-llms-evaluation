package org.traccar.protocol;

public class GeneratedTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeGpsPosition_WithoutLength() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, false, false, TimeZone.getDefault()));
    }

    @Test
    public void testDecodeGpsPosition_NoSatellites() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, false, true, TimeZone.getDefault()));
    }

    @Test
    public void testDecodeGpsPosition_NoSpeed() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, false, TimeZone.getDefault()));
    }

    @Test
    public void testDecodeGpsPosition_NoLength() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, true, false, true, TimeZone.getDefault()));
    }

    @Test
    public void testDecodeGpsPosition_NoSpeedAndNoLength() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, TimeZone.getDefault()));
    }

    @Test
    public void testDecodeGpsPosition_NoTimezone() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, TimeZone.getDefault()));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestamp() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT"))));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLength() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT"))));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeed() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT"))));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellites() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT"))));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezone() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT"))));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezoneOrChecksum() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT")), Checksum.CHECKSUM_NONE));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezoneOrChecksumOrChecksum() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT")), Checksum.CHECKSUM_NONE));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezoneOrChecksumOrChecksumOrTimestamp() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT")), Checksum.CHECKSUM_NONE));
    }

    @Test
    public void testDecodeGpsPosition_NoTimestampAndNoLengthOrSpeedOrSatellitesOrTimezoneOrChecksumOrChecksumOrTimestampOrTimestamp() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, true, true, Calendar.getInstance(TimeZone.getTimeZone("GMT")), Checksum.CHECKSUM_NONE));
    }

}