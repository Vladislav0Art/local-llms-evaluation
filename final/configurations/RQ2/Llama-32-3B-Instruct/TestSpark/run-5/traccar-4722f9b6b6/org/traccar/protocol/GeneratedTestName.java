package org.traccar.protocol;

public class GeneratedTestName {

    public int value() {
        return 0; // make it public
    }

    @Test
    public void testName() {
        Channel channel = new Channel("test");
        assertEquals(String.class, channel.name.getClass());
    }
}

public class Network {
    public String id;

    public Network(String id) {
        this.id = id;
    }

}