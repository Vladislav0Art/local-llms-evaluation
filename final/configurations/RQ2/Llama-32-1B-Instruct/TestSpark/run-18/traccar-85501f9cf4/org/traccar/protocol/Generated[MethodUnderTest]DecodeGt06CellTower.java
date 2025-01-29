package org.traccar.protocol;

public class Generated[MethodUnderTest]

DecodeGt06CellTower {

    @Test
    public void [MethodUnderTest]DecodeGt06CellTower() throws Exception {
        CellTower cellTower = new CellTower(1, 2, 3);
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 4;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = Protocol.encodeCellTower(cellTower, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06CellTowerTest";
    }

}