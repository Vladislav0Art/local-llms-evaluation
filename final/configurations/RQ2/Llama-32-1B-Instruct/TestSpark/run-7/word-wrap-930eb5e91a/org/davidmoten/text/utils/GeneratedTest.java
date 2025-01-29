package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTest {

    @BeforeClass
    public static void setUp() {
        Preconditions.checkNotNull(System.getProperty("line.separator"));
    }

    @Test
    public void testWordWrap_FromReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Writer out = new OutputStreamWriter(System.out);
        WordWrap wordWrap = from(new CharacterReader(reader));
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromClasspathUtf8() throws IOException {
        File file = new File("test.txt");
        Preconditions.checkNotNull(file);
        BufferedReader reader = new BufferedReader(new FileInputStream(file));
        Writer out = new OutputStreamWriter(System.out);
        WordWrap wordWrap = fromClasspathUtf8("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromClasspath() throws IOException {
        BufferedReader reader = new BufferedReader(new FileInputStream("test.txt"));
        Writer out = new OutputStreamWriter(System.out);
        WordWrap wordWrap = fromClasspath("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromStream() throws IOException {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Writer out = new OutputStreamWriter(System.out);
        WordWrap wordWrap = fromUtf8("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromStreamUtf8() throws IOException {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        OutputStreamWriter out = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        WordWrap wordWrap = fromUtf8("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromFile() throws IOException {
        File file = new File("test.txt");
        Preconditions.checkNotNull(file);
        BufferedReader reader = new BufferedReader(new FileInputStream(file));
        Writer out = new OutputStreamWriter(System.out);
        WordWrap wordWrap = fromClasspath("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromFileUtf8() throws IOException {
        File file = new File("test.txt");
        Preconditions.checkNotNull(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Writer out = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        WordWrap wordWrap = fromClasspathUtf8("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

    @Test
    public void testWordWrap_FromStringBuilder() throws IOException {
        StringBuilder2 sb = new StringBuilder2();
        WordWrap wordWrap = from(new CharacterReader(sb));
        wordWrap.wordWrap(sb, System.out, 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(System.out);
    }

    @Test
    public void testWordWrap_LeftTrim() throws IOException {
        String[] words = {"this", "is", "a", "test"};
        WordWrap wordWrap = new WordWrap();
        for (String word : words) {
            wordWrap.leftTrim(word);
        }
        Preconditions.checkNotNull(System.out);
    }

    @Test
    public void testWordWrap_RightTrim() throws IOException {
        String[] words = {"this", "is", "a", "test"};
        WordWrap wordWrap = new WordWrap();
        for (String word : words) {
            wordWrap.rightTrim(word);
        }
        Preconditions.checkNotNull(System.out);
    }

    @Test
    public void testWordWrap_ClosedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Reader in = from(reader);
        WordWrap wordWrap = from(in, StandardCharsets.UTF_8);
        Preconditions.checkNotNull(wordWrap);
    }

}