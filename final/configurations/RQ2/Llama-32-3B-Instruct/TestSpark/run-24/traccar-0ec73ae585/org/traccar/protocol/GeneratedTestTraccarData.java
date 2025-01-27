package org.traccar.protocol;

public class GeneratedTestTraccarData {

    @Test
    public void testTraccarData() {
        when(TraccarProtocol.generateData()).thenReturn("data".getBytes());
        ByteBuf buffer = ByteBufUtil.copiedBuffer(TraccarProtocol.generateData());
        assert buffer.capacity() == 4;
    }
}

}