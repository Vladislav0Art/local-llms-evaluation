package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

public class GeneratedRunInternalScenario2Test {

    @Test
    public void runInternalScenario2Test() throws ClassNotFoundException, IOException {
        Outline mockOutline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(mockOutline);
    }

}