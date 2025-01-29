package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

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
    public void testGetManufacturer() throws Exception {
        // mock getManufacturer method to return "TRACCA"
        String result = mock(String.class, "getManufacturer");
        verify(protocol).getManufacturer();

        // assert that result is as expected
        assertEquals("TRACCA", result);
    }

}