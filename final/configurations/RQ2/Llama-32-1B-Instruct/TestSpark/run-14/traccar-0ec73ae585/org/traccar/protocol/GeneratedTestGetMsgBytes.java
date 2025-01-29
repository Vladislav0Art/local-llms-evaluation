package org.traccar.protocol;

public class GeneratedTestGetMsgBytes {

    public Protocol protocol = new Protocol();

    public static void main(String[] args) {
        TestSpark testSpark = new TestSpark();
        testSpark.run();
    }

    @Test
    public void testGetMsgBytes() {
        Message msg = getMsg();
        assertEquals("Hello", msg.getStr());
    }

}