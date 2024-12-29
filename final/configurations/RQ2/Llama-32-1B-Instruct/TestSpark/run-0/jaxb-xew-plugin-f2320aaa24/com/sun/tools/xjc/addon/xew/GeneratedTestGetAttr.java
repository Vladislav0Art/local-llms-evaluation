package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAttr {

    @Test
    public void testGetAttr() {
        // Test for get attribute method
        ElementWrapper wrapper = new ElementWrapper();
        wrapper.attr = "example";
        Assert.assertEquals("example", wrapper.attr);

        // Test for add annotation method
        ElementWrapper wrapper2 = new ElementWrapper();
        wrapper2.addAnnotation("parametrization");
        Assert.assertTrue(wrapper2.isParametrization());
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String value) {
        this.attr = value;
    }

}