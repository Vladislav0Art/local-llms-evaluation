package org.traccar.protocol;

public class GeneratedTest {

}

public class Channel {
}

public class NetworkMessage {
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
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

public class PublicNetworkMessage extends NetworkMessage {
    public PublicNetworkMessage(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PublicNetworkMessage [content=" + this.content + "]";
    }
}

public class GeneratedTest {

}