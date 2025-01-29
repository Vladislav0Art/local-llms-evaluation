package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testPopStackToClose() {
        String startTag = "<child>";
        Object[] stack = new Object[1];
        ((Object) stack)[0] = "start";
        Main.popStackToClose(startTag, "end");
        assert stack[0].equals("end");
    }

    @Test
    public void testPopStackToClose_2() {
        String startTag = "<child>";
        Object[] stack = new Object[1];
        ((Object) stack)[0] = "start";
        Main.popStackToClose(startTag, "end");
        assert stack[0].equals("end");
    }

    @Test
    public void testPopStackToClose_3() {
        String startTag = "<child>";
        Object[] stack = new Object[1];
        ((Object) stack)[0] = "start";
        Main.popStackToClose(startTag, "");
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "end");
        assert stack.length == 1;
        assert stack[0].equals("end");
    }

    @Test
    public void testGetPopStackFromStack_2() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "end");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_3() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_4() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "", "");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_5() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "end");
        assert stack.length == 1;
        assert stack[0].equals("end");
    }

    @Test
    public void testGetPopStackFromStack_6() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "start");
        assert stack.length == 1;
        assert stack[0].equals("start");
    }

    @Test
    public void testGetPopStackFromStack_7() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "end");
        assert stack.length == 1;
        assert stack[0].equals("end");
    }

    @Test
    public void testGetPopStackFromStack_8() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "", "start");
        assert stack.length == 1;
        assert stack[0].equals("end");
    }

    @Test
    public void testGetPopStackFromStack_9() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "start");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_10() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "start");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_11() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "end");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_12() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "", "");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_13() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "start");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_14() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "", "start");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

    @Test
    public void testGetPopStackFromStack_15() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("start", "end");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}