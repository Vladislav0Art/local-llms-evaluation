package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetPopStackFromStack_3 {

    @Test
    public void testGetPopStackFromStack_3() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}