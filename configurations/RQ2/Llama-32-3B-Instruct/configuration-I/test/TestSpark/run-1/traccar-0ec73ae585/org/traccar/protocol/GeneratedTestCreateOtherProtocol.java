package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestCreateOtherProtocol {

}

public interface BaseProtocolDecoder {
}

public abstract class OtherProtocol extends BaseProtocolDecoder {
    @Override
    protected boolean getHasValidMessage() {
        return false;
    }
}

public class WatchProtocolDecoder implements BaseProtocolDecoder {
    private String protocol;

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean getValidMessage() {
        return getHasValidMessage();
    }

    protected boolean getHasValidMessage() {
        return false;
    }
}

public class GeneratedTest {

    @Before
    public void setup() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = WatchProtocolDecoder.create("WatchProtocol");
        decoder.setProtocol(protocol.getProtocol());
    }

    @Test
    public void testCreateOtherProtocol() {
        OtherProtocol otherProtocol = new OtherProtocol();
        WatchProtocolDecoder decoder = WatchProtocolDecoder.create("OtherProtocol");
        assert !decoder.getValidMessage();
    }

}