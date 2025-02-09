package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalWithNullOutlineTest {

    @Test
    public void runInternalWithNullOutlineTest() throws Exception {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(null);
    }

}