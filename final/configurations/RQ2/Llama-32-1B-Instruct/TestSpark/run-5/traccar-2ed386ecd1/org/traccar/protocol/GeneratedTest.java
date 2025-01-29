package org.traccar.protocol;

public class GeneratedTest {

    private static final Protocol protocol = new Protocol() {
    };

    @Test
    public void decodeGpsTest_positionDecode() throws Exception {
        Position position = new Position();
        position.setLocation(10, 20, 30);
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, false, true, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, false, true, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasSatellitesDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasSpeedDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedAndDateDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedAndDateAndDateDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedAndDateDecodeAndTimezoneDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneAndDateDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneAndDateAndChecksumDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneDecodeAndChecksumDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneDecodeAndChecksumDecodeAndDateDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneDecodeAndChecksumDecodeAndDateDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

}