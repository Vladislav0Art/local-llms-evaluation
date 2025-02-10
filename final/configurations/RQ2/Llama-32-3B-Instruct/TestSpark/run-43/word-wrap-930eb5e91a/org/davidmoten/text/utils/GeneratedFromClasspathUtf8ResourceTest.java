package org.davidmoten.text.utils;

public class GeneratedFromClasspathUtf8ResourceTest {

    @Test
    public void fromClasspathUtf8ResourceTest() {
        String resource = "test.resource";
        assertTrue(WordWrap.fromClasspathUtf8(resource).isPresent());
    }

}