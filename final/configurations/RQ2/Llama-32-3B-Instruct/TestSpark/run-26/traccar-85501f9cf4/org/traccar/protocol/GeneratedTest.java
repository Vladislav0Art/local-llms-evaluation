package org.traccar.protocol;

public class GeneratedTest {

    public static int getType() {
        return 123;
    }
}

public class Gt06SocketAddress {
    public static String getAddress() {
        return "127.0.0.1";
    }
}

public class ProtocolMock {
    public static <T> T mock(Class<T> clazz) {
        // implement mock creation logic here
        return null;
    }

    public static void when(T obj, String methodStr, Object... args) {
        // implement when method for mocking
    }
}

public class Gt06Channel {
    public static Gt06SocketAddress getRemoteAddress() {
        return new Gt06SocketAddress();
    }

    public static Gt06Message getMessage() {
        return null;
    }
}

public class Protocol {
    public void doSomething() {
    }
}

public class Gt06ProtocolDecoder {

    private Object channel;

    public Gt06ProtocolDecoder(Object channel) {
        this.channel = channel;
    }

    public void setChannel(Object channel) {
        this.channel = channel;
    }

    public Object getChannel() {
        return channel;
    }
}

public class TestGt06ProtocolDecoder {

}