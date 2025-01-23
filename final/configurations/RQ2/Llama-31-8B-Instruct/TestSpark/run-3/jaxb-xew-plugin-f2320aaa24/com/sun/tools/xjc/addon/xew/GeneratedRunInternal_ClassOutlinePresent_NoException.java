package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_ClassOutlinePresent_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_ClassOutlinePresent_NoException() throws Exception {
        Outline outline = new Outline();
        ClassOutline classOutline = new ClassOutline();
        outline.setClasses(singletonList(classOutline));
        plugin.runInternal(outline);
    }

}