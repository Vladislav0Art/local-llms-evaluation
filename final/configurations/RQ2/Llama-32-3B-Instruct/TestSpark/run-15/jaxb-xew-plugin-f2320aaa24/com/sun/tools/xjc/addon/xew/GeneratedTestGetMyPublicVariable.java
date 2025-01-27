package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetMyPublicVariable {

    private String myPublicVariable;

    public void setMyPublicVariable(String myPublicVariable) {
        this.myPublicVariable = myPublicVariable;
    }

    public String getMyPublicVariable() {
        return myPublicVariable;
    }
}

public class TestJFieldVar {

    @Test
    public void testGetMyPublicVariable() {
        JFieldVar jFieldVar = new JFieldVar();
        jFieldVar.setMyPublicVariable("testValue");
        assertEquals("testValue", jFieldVar.getMyPublicVariable());
    }

}