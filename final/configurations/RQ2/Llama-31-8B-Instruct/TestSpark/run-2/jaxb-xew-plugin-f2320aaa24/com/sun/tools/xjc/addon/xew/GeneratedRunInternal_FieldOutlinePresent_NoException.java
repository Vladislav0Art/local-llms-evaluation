package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_FieldOutlinePresent_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_FieldOutlinePresent_NoException() throws Exception {
        Outline outline = new Outline();
        FieldOutline fieldOutline = new FieldOutline();
        outline.setFields(singletonList(fieldOutline));
        plugin.runInternal(outline);
    }

}