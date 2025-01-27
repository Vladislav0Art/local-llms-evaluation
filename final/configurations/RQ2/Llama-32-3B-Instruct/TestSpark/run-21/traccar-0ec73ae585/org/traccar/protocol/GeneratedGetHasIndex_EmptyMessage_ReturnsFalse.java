package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_EmptyMessage_ReturnsFalse {

    boolean getHasIndex(NetworkMessage message);
}

public class DefaultWatchProtocolDecoder implements WatchProtocolDecoder {
    @Override
    public boolean getHasIndex(NetworkMessage message) {
        return false;
    }
}

public class NetworkMessage {
    // add some properties like id, data, etc.
}

@RunWith(MockitoJUnitRunner.class)
public class ProtocolDecoderTest {

    @Mock
    private DefaultWatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getHasIndex_EmptyMessage_ReturnsFalse() {
        when(watchProtocolDecoder.getHasIndex(Mockito.any(NetworkMessage.class))).thenReturn(false);
        assertTrue(watchProtocolDecoder.getHasIndex(null));
    }

}