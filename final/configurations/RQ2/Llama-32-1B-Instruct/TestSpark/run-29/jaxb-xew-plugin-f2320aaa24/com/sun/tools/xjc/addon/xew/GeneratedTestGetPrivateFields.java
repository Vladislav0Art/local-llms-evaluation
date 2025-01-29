package com.sun.tools.xjc.addon.xew;

import static com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin.*;

public class GeneratedTestGetPrivateFields {

    @Test
    public void testGetPrivateFields() {
        JClass classObj = getPackage().loadClass("com.sun.tools.xjc.addon.xew.MyElement");
        List<JFieldVar> fieldVars = (List<JFieldVar>) classObj.getMethod("getPrivateFields").invoke(null);
        for (JFieldVar fieldVar : fieldVars) {
            System.out.println(fieldVar.getName());
        }
    }

}