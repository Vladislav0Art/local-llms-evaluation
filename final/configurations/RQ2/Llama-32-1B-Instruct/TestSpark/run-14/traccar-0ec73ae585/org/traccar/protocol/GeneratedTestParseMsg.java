package org.traccar.protocol;

public class GeneratedTestParseMsg {

    public Protocol protocol = new Protocol();

    public static void main(String[] args) {
        TestSpark testSpark = new TestSpark();
        testSpark.run();
    }

    @Test
    public void testParseMsg() {
        Message msg = parseMsg();
        assertEquals(1, msg.getBytes().length);
    }

}