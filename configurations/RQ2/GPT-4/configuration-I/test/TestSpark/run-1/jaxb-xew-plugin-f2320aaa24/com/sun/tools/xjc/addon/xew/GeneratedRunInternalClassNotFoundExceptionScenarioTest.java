package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;
import static org.junit.Assert.*;

import com.sun.tools.xjc.outline.Outline;
import org.mockito.Mockito;
import com.sun.tools.xjc.Outline;

public class GeneratedRunInternalClassNotFoundExceptionScenarioTest {

    @Test
    public void runInternalClassNotFoundExceptionScenarioTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(null);  // which will result ClassNotFoundException as per your expected scenario
    }

}