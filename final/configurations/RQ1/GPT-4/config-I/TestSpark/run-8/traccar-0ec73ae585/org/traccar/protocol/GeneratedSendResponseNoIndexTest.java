package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSendResponseNoIndexTest {

    @Test
    public void sendResponseNoIndexTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress address = InetSocketAddress.createUnresolved("10.0.0.1", 4088);
        when(channel.remoteAddress()).thenReturn(address);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        decoder.sendResponse(channel, "123456789", null, "test response");

        ArgumentCaptor<NetworkMessage> argument = ArgumentCaptor.forClass(NetworkMessage.class);
        verify(channel).writeAndFlush(argument.capture());

        String data = argument.getValue().getMessage().toString(CharsetUtil.US_ASCII);
        Assert.assertEquals("[test*123456789*000c*test response]", data);
    }

}