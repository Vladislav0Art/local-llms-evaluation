package org.davidmoten.text.utils;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        assertTrue(WordWrap.from(reader).isPresent());
    }

}