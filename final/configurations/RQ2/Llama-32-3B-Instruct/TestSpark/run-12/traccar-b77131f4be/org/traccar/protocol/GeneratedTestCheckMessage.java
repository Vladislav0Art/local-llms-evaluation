package org.traccar.protocol;

public class GeneratedTestCheckMessage {

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
    public void testCheckMessage() {
        // Given
        String messageContent = "message";
        PublicNetworkMessage message = new PublicNetworkMessage(messageContent);

        // When
        String result = checkMessage();

        // Then
        assertEquals("Success: PublicNetworkMessage [content=" + message.getContent() + "]", result);
    }

    public static String checkMessage() {
        PublicNetworkMessage message = new PublicNetworkMessage("message");
        return "Success: " + message.toString();
    }

}