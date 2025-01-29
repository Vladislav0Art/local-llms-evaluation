package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_EmptyReader {

    protected Writer writer;
    protected BufferedReader reader;

    @Before
    public void setup() {
        writer = new OutputStreamWriter(new FileOutputStream(new File("output.txt")));
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Test
    public void testWordWrap_EmptyReader() {
        Preconditions.checkNotNull(writer);
        Preconditions.checkNotNull(reader);

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.wordWrap(reader, writer).length());
    }

}