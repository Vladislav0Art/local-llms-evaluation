package org.traccar.protocol;

public class GeneratedTestDecodeWithoutGt06Protocol {

    @Test
    public void testDecodeWithoutGt06Protocol() {
        MockProtocol protocol = mock(Protocol.class);
        when(protocol.getGt06Protocol()).thenReturn(null);

        // no-op
    }

}