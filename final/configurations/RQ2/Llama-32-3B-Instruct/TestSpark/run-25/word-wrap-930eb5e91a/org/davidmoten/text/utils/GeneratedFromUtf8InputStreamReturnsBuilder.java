package org.davidmoten.text.utils;

public class GeneratedFromUtf8InputStreamReturnsBuilder {

    public static BufferedReader bufferedReader;

    public static void setReader(BufferedReader reader) {
        ReaderMock.bufferedReader = reader;
    }
}

public class WriterMock {
    public static Writer writer;

    public static void setWriter(Writer writer) {
        WriterMock.writer = writer;
    }
}

public class LineConsumerMock {
    public static void lineConsumer() {
    }
}

public class WordWrapTest {

    @Mock
    private BufferedReader bufferedReader;

    @Mock
    private Writer writer;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    @Test
    public void fromUtf8InputStreamReturnsBuilder() {
        Preconditions.checkState(wordWrap.fromUtf8(new FileInputStream("resource")) instanceof WordWrap.Builder);
    }

}