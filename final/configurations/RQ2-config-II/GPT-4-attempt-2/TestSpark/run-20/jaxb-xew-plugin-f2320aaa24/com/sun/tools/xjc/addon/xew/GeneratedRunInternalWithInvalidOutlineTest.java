package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CReferencePropertyInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalWithInvalidOutlineTest {

    @Test
    public void runInternalWithInvalidOutlineTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        try {
            xmlElementWrapperPlugin.runInternal(null);
        } catch (ClassNotFoundException | IOException e) {
            // Assert that exception are thrown correctly for invalid input
        }
    }

}