package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodeGpsPosition() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");
        // ...

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, false, false, false, null);

        assertEquals(10, buf.readUnsignedInt());
        assertEquals("37.7749", new String(buf.readLine().getBytes(), StandardCharsets.UTF_8));
        assertEquals("-122.4194", new String(buf.readLine().getBytes(), StandardCharsets.UTF_8));
    }

    @Test
    public void testDecodeGpsNoLength() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, false, null);

        assertEquals(10, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithSatellites() {
        ByteBuf buf = Unpooled.buffer(11);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(11, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithSpeed() {
        ByteBuf buf = Unpooled.buffer(12);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, false, null);

        assertEquals(12, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksum() {
        ByteBuf buf = Unpooled.buffer(13);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, false, null);

        assertEquals(13, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSatellites() {
        ByteBuf buf = Unpooled.buffer(14);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(14, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeed() {
        ByteBuf buf = Unpooled.buffer(15);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, false, null);

        assertEquals(15, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSatellitesAndSpeed() {
        ByteBuf buf = Unpooled.buffer(16);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(16, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndChecksum() {
        ByteBuf buf = Unpooled.buffer(17);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, false, null);

        assertEquals(17, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksum() {
        ByteBuf buf = Unpooled.buffer(18);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(18, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(19);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(19, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(20);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(20, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(21);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(21, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(22);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(22, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(23);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(23, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(24);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(24, buf.readUnsignedInt());
    }

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(25);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(25, buf.readUnsignedInt());
    }

}