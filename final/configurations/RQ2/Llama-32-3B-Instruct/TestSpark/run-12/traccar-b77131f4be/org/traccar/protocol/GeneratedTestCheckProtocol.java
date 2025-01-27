package org.traccar.protocol;

public class GeneratedTestCheckProtocol {

    private int id;

    public Protocol(int id) {
        this.id = id;
    }

    public String getName() {
        return "Protocol " + id;
    }
}

public class Channel {
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "NetworkMessage [content=" + content + "]";
    }
}

public class PublicProtocol extends Protocol {
    public PublicProtocol(int id) {
        super(id);
    }

    public String getName() {
        return "Public Protocol";
    }
}

public class PublicChannel extends Channel {
    public PublicChannel(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

public class PublicNetworkMessage extends NetworkMessage {
    public PublicNetworkMessage(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return "PublicNetworkMessage [content=" + getContent() + "]";
    }
}

public class GeneratedTest {

    @Test
    public void testCheckProtocol() {
        // Given
        int protocolId = 1;
        PublicProtocol protocol = new PublicProtocol(protocolId);

        // When
        String result = checkProtocol(protocolId);

        // Then
        assertEquals("Success: Public Protocol", result);
    }

    public static String checkProtocol(int protocolId) {
        PublicProtocol protocol = new PublicProtocol(protocolId);
        return "Success: " + protocol.getName();
    }

}