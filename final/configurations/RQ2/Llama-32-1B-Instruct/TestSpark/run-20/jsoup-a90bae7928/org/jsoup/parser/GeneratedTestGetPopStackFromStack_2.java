package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetPopStackFromStack_2 {

    @Test
    public void testGetPopStackFromStack_2() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "end");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}