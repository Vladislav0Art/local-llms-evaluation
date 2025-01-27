package com.sun.tools.xjc.addon.xew;

public class GeneratedSetOutlineTest {

    @Test
    public void setOutlineTest() {
        // Test case: Set outline for class outline
        ClassOutline outline = new ClassOutline();
        Outline result = new Outline();
        outline.setOutline(result);
        assertEquals(result, outline.getOutline());
    }
}

}