package org.traccar.protocol;

public class GeneratedTestId {

    public int value() {
        return 0; // make it public
    }

    @Test
    public void testId() {
        Network network = new Network("test");
        assertEquals(String.class, network.id.getClass());
    }
}

public class Date {
    public int year;

    public Date(int year) {
        this.year = year;
    }

}