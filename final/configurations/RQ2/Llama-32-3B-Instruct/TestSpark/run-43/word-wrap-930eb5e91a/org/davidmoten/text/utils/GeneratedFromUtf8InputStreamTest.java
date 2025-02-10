package org.davidmoten.text.utils;

public class GeneratedFromUtf8InputStreamTest {

    @Test
    public void fromUtf8InputStreamTest() throws IOException {
        byte[] data = {0x68, 0x65, 0x6c, 0x6c, 0x6f};
        InputStream in = new ByteArrayInputStream(data);
        assertTrue(WordWrap.from(in).isPresent());
    }

}