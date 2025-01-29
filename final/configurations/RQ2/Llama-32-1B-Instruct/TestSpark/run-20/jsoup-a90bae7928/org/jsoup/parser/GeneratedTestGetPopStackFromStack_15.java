package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetPopStackFromStack_15 {

    @Test
    public void testGetPopStackFromStack_15() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "end");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}