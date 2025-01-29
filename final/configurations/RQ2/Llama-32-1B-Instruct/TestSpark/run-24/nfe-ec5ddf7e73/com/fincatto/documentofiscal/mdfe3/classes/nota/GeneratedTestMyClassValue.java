package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestMyClassValue {

    private int value;

    public int getValue() {
        return value;
    }

    public String getPublicMethod1Result() {
        return "Result";
    }

    public String getPublicMethod2Result() {
        return "Result";
    }
}

@Test
public void testMyClassValue() {
    MyClass myClass = new MyClass();
    assertEquals(0, myClass.getValue());
    assertEquals("result", myClass.getPublicMethod1Result());
    assertEquals("Result", myClass.getPublicMethod2Result());
}

}