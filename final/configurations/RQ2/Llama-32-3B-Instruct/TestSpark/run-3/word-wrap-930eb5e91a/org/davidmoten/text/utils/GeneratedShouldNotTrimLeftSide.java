package org.davidmoten.text.utils;

public class GeneratedShouldNotTrimLeftSide {

    @Test
    public void shouldNotTrimLeftSide() {
        String input = "Hello World   ";
        String expectedOutput = "Hello World   ";
        assertEquals(expectedOutput, WordWrap.trimRight(input));
    }

}

public class GeneratedTest {

    public static void main(String[] args) throws Exception {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

}