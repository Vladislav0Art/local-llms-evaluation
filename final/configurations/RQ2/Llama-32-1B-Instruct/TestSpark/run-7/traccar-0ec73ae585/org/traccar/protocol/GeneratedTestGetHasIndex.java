package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Rule
    public LiveServerStub liveServer = new LiveServerStub("localhost", 8080);

    private Protocol protocol;
    private DeviceSession device;

    @Before
    public void setup() {
        // setup device and protocol
        device = new DeviceSession();
        protocol = new Protocol();
    }

    @Test
    public void testGetHasIndex() throws Exception {
        // mock getHasIndex method to return true
        boolean result = mock(Protocol.class, "getHasIndex");
        verify(protocol).getHasIndex();

        // assert that result is as expected
        assertTrue(result);
    }

}