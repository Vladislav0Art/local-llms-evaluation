package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetPopStackFromStack_9 {

    @Test
    public void testGetPopStackFromStack_9() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "start");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}