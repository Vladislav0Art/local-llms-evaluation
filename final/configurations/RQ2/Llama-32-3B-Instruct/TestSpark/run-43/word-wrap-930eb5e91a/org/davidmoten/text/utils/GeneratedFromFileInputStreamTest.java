package org.davidmoten.text.utils;

public class GeneratedFromFileInputStreamTest {

    @Test
    public void fromFileInputStreamTest() throws IOException {
        byte[] data = {0x68, 0x65, 0x6c, 0x6c, 0x6f};
        InputStream in = new FileInputStream(new ByteArrayInputStream(data));
        assertTrue(WordWrap.from(in).isPresent());
    }

}