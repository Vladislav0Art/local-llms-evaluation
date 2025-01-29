package org.traccar.protocol;

public class GeneratedTestDecodeCellTower {

    @Test
    public void testDecodeCellTower() {
        ByteBuf buf = Unpooled.buffer(16);
        CellTower cellTower = new CellTower();
        // Set up the mock
        Mockito.when(BcdUtil.decodeByte(buf)).thenReturn((byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        if (!decoder.decodeCellTower(buf, null)) {
            fail("Failed to decode cell tower");
        }
    }

}