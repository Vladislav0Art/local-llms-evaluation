package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat {

    private byte[] bytes;

    public InputSource(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}

public class ByteArrayInputStream extends java.io.ByteArrayInputStream {
    // No need to override anything here
}

public class GeneratedTest {

    private InputSource inputSource;

    @Before
    public void setUp() {
        String cssCode = "body { background-color: #f2f2f2; }";
        byte[] bytes = cssCode.getBytes();
        inputSource = new InputSource(bytes);
    }

    @Test
    public void testDoFormat() throws IOException {
        // Given
        InputSource input = new InputSource(new ByteArrayInputStream("".getBytes()));

        // When
        String result = formatter.doFormat(input);

        // Then
        assertTrue(result.contains("body {"));
        assertFalse(result.contains("background-color: #f2f2f2;") && result.contains("background-color: #f2f2f2;"));
    }

}