package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testEquals() {
        assertEquals("aws-november-2017.1", generateTest());
    }

    @Test
    public void testNotEquals() {
        assertTrue(generateTest().equals(""));
    }
}

}