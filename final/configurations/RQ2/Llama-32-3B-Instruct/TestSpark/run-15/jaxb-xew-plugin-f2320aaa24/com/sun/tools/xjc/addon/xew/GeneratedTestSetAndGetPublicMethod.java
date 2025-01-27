package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetAndGetPublicMethod {

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
    public void testSetAndGetPublicMethod() {
        JFieldVar jFieldVar = new JFieldVar();
        jFieldVar.setMyPublicVariable("testValue");
        assertNotEquals(null, jFieldVar.getMyPublicVariable());
    }

}