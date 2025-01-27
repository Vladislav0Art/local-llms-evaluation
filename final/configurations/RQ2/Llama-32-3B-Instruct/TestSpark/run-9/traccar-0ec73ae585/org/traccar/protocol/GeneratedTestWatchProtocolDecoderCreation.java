package org.traccar.protocol;

public class GeneratedTestWatchProtocolDecoderCreation {

    private int id;
    private String type;
    private String data;

    public static NetworkMessage createNetworkMessage(int id, String type, String data) {
        return new NetworkMessage(id, type, data);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class WatchProtocolDecoder {
    private static final int WATCH = 1;

    public enum Protocol {WATCH}

    ;

    private boolean hasIndex;

    public WatchProtocolDecoder(boolean hasIndex) {
        this.hasIndex = hasIndex;
    }

    public static WatchProtocolDecoder createWatchProtocolDecoder(boolean hasIndex) {
        return new WatchProtocolDecoder(hasIndex);
    }

    public boolean getHasIndex() {
        return hasIndex;
    }

    public String getManufacturer() {
        return "Test Manufacturer";
    }
}

public class TestWatchProtocolDecoder {

    @Test
    public void testWatchProtocolDecoderCreation() {
        boolean hasIndex = true;
        WatchProtocolDecoder watchProtocolDecoder = WatchProtocolDecoder.createWatchProtocolDecoder(hasIndex);
        assertTrue(watchProtocolDecoder.getHasIndex());
        assertEquals(1, WATCH);
    }

}