package org.traccar.protocol;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTest {

    boolean getHasIndex(NetworkMessage message);
}

public class DefaultWatchProtocolDecoder implements WatchProtocolDecoder {
    @Override
    public boolean getHasIndex(NetworkMessage message) {
        return false;
    }
}

public class NetworkMessage {
    private String id;
    private byte[] data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}

@RunWith(org.junit.runners.JUnit4.class)
public class ProtocolDecoderTest {

    @Mock
    private DefaultWatchProtocolDecoder watchProtocolDecoder;

    @InjectMocks
    private WatchProtocolDecoder protocolDecoder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

}