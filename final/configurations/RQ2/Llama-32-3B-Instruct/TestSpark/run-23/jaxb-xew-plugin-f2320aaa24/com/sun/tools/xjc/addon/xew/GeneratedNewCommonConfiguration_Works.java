package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewCommonConfiguration_Works {

    @Test
    public void newCommonConfiguration_Works() {
        XmlElementWrapperPluginConfig config = new XmlElementWrapperPluginConfig();
        assertTrue(config instanceof CommonConfiguration);
    }
}

}