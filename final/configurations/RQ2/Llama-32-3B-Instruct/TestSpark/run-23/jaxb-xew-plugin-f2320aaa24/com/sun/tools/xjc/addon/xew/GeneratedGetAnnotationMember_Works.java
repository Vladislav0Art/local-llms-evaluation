package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetAnnotationMember_Works {

    @Test
    public void getAnnotationMember_Works() throws Exception {
        String annotation = "annotation";
        Object member = "member";
        assertEquals(member, XmlElementWrapperPluginUtils.getAnnotationMember(annotation, member));
    }

}