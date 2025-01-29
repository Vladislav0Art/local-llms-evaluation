package org.traccar.protocol;

public class GeneratedTestGetMsgFromBuffer {

    public Protocol protocol = new Protocol();

    public static void main(String[] args) {
        TestSpark testSpark = new TestSpark();
        testSpark.run();
    }

    @Test
    public void testGetMsgFromBuffer() {
        Buffer buffer = new Buffer();
        buffer.write("Hello".getBytes(StandardCharsets.UTF_8));
        Message msg = getMsgFromBuffer(buffer);
        assertEquals("Hello", msg.str);
    }

    private static Message parseMsgFromBuffer(Buffer buffer) {
        // Assuming the parser is a Parser
        Parser parser = new Parser(buffer);
        return parser.parse();
    }

}