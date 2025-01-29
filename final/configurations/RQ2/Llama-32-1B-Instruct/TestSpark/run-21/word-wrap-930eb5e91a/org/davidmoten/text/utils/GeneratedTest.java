package org.davidmoten.text.utils;

public class GeneratedTest {

    public static class Reader {
        public int read() {
            return 0;
        }
    }

    public static class IOException {
    }

    @Mock
    private Reader reader;

    @Test
    public void testFromReader() {
        when(reader.read()).thenReturn(0);

        wordWrap.from(reader, out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromClasspathUtf8() {
        when(reader.read()).thenReturn(0);

        wordWrap.fromClasspathUtf8("test.txt", StandardCharsets.UTF_8);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromClasspath() {
        when(reader.read()).thenReturn(0);

        wordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromCharSet() {
        when(reader.read()).thenReturn(0);

        wordWrap.fromClasspathUtf8("test.txt", charset);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromInputStream() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(inputStream, out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(File.classpathResource("test.txt"), out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromFileInputStream() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new ByteArrayOutputStream(), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromFileInputStream() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new ByteArrayOutputStream(), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new FileOutputStream(File.classpathResource("output.txt")), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromFileInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new FileOutputStream(File.classpathResource("output.txt")), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new FileOutputStream(File.classpathResource("output.txt")), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new FileOutputStream(File.classpathResource("output.txt")), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new FileOutputStream(File.classpathResource("output.txt")), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

}