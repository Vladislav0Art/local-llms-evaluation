package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition_NoLength {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeGpsPosition_NoLength() {
        String[] expectedOutput = {"1234567890", "0"};
        byte[] buf = Mockito.mock(ByteBuf.class);
        when(decoder.decode(buf, null, null)).thenReturn(expectedOutput);
        assertEquals(expectedOutput[0], decoder.decode(new Position(), buf, true, false, true, TimeZone.getDefault()));
    }

}