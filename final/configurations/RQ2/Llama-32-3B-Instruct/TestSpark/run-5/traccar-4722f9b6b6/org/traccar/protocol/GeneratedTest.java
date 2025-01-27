package org.traccar.protocol;

public class GeneratedTest {

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

    @Test
    public void testYear() {
        Date date = new Date(2022);
        assertEquals(Integer.class, date.year.getClass());
    }
}

public class GeneratedClass {
    public String message;

    public GeneratedClass(String message) {
        this.message = message;
    }

    @Test
    public void testMessage() {
        GeneratedClass gc = new GeneratedClass("Hello World");
        assertEquals(String.class, gc.message.getClass());
    }

}