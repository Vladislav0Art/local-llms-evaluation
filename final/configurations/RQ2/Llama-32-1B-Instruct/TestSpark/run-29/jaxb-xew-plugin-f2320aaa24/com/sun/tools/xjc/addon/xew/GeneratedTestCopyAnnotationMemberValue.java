package com.sun.tools.xjc.addon.xew;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GeneratedTestCopyAnnotationMemberValue {

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annot = getAnnotation(XMLElementWrapper.class);
        Object member = copyAnnotationMemberValue(annot, "member");
        assert member != null;
    }

}