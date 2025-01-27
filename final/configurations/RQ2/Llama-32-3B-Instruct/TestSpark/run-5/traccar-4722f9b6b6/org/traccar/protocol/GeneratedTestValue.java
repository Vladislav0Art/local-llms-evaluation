package org.traccar.protocol;

public class GeneratedTestValue {

    public int value() {
        return 0; // make it public
    }

    @Test
    public void testValue() {
        int value = this.value();
        assertEquals(Integer.class, value.getClass());
    }
}

public class Channel {
    public String name;

    public Channel(String name) {
        this.name = name;
    }

}