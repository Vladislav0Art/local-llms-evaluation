package org.traccar.protocol;

public class GeneratedTestGetDecoder {

    private Parser decoder;

    public void setDecoder(Parser decoder) {
        this.decoder = decoder;
    }

    public Parser getDecoder() {
        return this.decoder;
    }
}

public class DeviceSession {
}

public class NetworkMessage {
}

public class CellTower {
}

public class WifiAccessPoint {
}
}

public class TraccarGeneratedTest {

    @Test
    public void testGetDecoder() throws Exception {
        Protocol protocol = new Protocol();
        DeviceSession session = new DeviceSession();

        protocol.setDecoder(new Parser());

        assertEquals(protocol.getDecoder(), protocol.getDecoder());
    }
}

}