package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetHasIndex_OtherProtocol_ReturnsFalse {

    @Test
    public void getHasIndex_OtherProtocol_ReturnsFalse() {
        OtherProtocol otherProtocol = new OtherProtocol();
        assertFalse(otherProtocol.getHasIndex());
    }
}

public class Channel {
    // Implementation details...
}

public class SocketAddress {
    // Implementation details...
}

public class Protocol {
    private boolean validMessage;

    public void setValidMessage(boolean validMessage) {
        this.validMessage = validMessage;
    }

    public boolean getValidMessage() {
        return validMessage;
    }
}

public class WatchProtocol extends BaseProtocolDecoder {
    public WatchProtocol() {
    }

}