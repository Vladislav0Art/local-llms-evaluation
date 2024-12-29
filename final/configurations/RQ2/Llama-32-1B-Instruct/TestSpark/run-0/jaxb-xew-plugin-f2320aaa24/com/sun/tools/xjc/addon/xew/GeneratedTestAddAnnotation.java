package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddAnnotation {

    @Test
    public void testAddAnnotation() {
        // Test for add annotation method
        ElementWrapper wrapper = new ElementWrapper();
        wrapper.addAnnotation("parametrization");
        Assert.assertTrue(wrapper.isParametrization());
    }

    public boolean isParametrization() {
        return parametrization;
    }
}

}