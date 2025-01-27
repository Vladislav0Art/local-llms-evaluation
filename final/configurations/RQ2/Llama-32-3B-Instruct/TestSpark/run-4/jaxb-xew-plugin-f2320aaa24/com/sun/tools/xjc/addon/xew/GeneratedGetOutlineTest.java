package com.sun.tools.xjc.addon.xew;

public class GeneratedGetOutlineTest {

    @Test
    public void getOutlineTest() {
        // Test case: Get outline from class outline
        ClassOutline outline = new ClassOutline();
        Outline result = outline.getOutline();
        assertNotNull(result);
    }

}