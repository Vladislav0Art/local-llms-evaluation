package org.davidmoten.text.utils;

public class GeneratedFromStringWriterTest {

    @Test
    public void fromStringWriterTest() {
        Writer writer = new StringWriter();
        writer.write("Hello World!");
        assertEquals("Hello World!", WordWrap.toString(writer));
    }

}