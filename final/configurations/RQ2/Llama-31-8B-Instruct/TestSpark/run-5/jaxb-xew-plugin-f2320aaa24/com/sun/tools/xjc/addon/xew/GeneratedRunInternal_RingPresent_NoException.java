package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_RingPresent_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_RingPresent_NoException() throws Exception {
        Outline outline = new Outline();
        Ring ring = new Ring();
        outline.setRing(ring);
        plugin.runInternal(outline);
    }

}