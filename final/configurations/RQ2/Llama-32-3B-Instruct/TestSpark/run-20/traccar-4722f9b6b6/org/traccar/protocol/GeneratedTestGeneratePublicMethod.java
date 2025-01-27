package org.traccar.protocol;

public class GeneratedTestGeneratePublicMethod {

    public enum WatchType {
        WATCH_TYPE_1,
        WATCH_TYPE_2,
        WATCH_TYPE_3
    }

    private final WatchType watchType;

    public Protocol(WatchType watchType) {
        this.watchType = watchType;
    }

    public WatchType getWatchType() {
        return watchType;
    }
}

public class TestProtocol {

    @Test
    public void testGeneratePublicMethod() {
        // Arrange
        Protocol protocol = new Protocol(Protocol.WatchType.WATCH_TYPE_2);

        // Act
        assert protocol.getWatchType() == Protocol.WatchType.WATCH_TYPE_2;
    }

}