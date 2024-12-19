package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocolMessage {

    public boolean getHasIndex() {
        return false;
    }

    public String getManufacturer() {
        return null;
    }
}

public class GeneratedTest {

    @Test
    public void testDecode_WatchProtocolMessage() throws Exception {
        Protocol protocol = new Protocol();

        Object manufacturer = protocol.getManufacturer();
        assertEquals("Unknown", (String) manufacturer);

        Object hasIndex = ((WatchProtocolDecoder) new WatchProtocolDecoder()).getHasIndex();
        assertTrue(hasIndex instanceof Boolean);
        assertTrue(((Boolean) hasIndex).booleanValue());

        Object index = ((WatchProtocolDecoder) new WatchProtocolDecoder()).getHasIndex();
        assertEquals("Unknown", (String) index);

        Object manufacturer2 = protocol.getManufacturer();
        assertEquals("Unknown", (String) manufacturer2);
    }

    public static class Protocol {
        public String getManufacturer() {
            return null;
        }

        public boolean getHasIndex() {
            return false;
        }
    }

}