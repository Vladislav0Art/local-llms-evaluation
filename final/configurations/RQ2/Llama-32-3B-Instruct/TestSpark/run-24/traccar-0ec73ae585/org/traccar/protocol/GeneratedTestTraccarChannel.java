package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestTraccarChannel {

    @Test
    public void testTraccarChannel() {
        when(TraccarProtocol.createChannel()).thenReturn(mock(TraccarChannel.class));

        TraccarChannel channel = TraccarProtocol.createChannel();
        // add assertions here
    }
}

}