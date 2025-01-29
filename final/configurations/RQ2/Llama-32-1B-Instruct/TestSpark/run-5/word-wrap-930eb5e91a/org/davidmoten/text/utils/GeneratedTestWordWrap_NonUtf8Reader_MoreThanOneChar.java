package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_NonUtf8Reader_MoreThanOneChar {

    protected Writer writer;
    protected BufferedReader reader;

    @Before
    public void setup() {
        writer = new OutputStreamWriter(new FileOutputStream(new File("output.txt")));
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Test
    public void testWordWrap_NonUtf8Reader_MoreThanOneChar() {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.wordWrap(reader, writer).length());
    }

}