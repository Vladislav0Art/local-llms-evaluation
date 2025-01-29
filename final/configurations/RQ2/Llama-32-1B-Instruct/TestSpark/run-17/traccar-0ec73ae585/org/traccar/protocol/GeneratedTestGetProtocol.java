package org.traccar.protocol;

public class GeneratedTestGetProtocol {

    @Test
    public void testGetProtocol() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals(new Protocol(getProtocol(WATCH)), decoder.getProtocol());
    }

    public static class Protocol {

        private final byte[] data;

        public Protocol(byte[] data) {
            this.data = data;
        }

        public String toString() {
            return "type=" + getDataType();
        }

        private String getDataType() {
            // Simplified method to get the protocol type
            return getProtocolType().toString();
        }

        public static String getProtocolType() {
            switch (data[0]) {
                case 'W':
                    return "Watch";
                default:
                    throw new UnsupportedOperationException("Unsupported protocol");
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Protocol protocol = (Protocol) o;
            return Objects.equals(data, protocol.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }

}