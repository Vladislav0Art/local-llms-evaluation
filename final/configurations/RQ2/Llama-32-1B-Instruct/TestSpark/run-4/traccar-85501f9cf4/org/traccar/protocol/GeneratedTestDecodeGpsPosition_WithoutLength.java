package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition_WithoutLength {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeGpsPosition_WithoutLength() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, false, false, false, TimeZone.getDefault()));
    }

}