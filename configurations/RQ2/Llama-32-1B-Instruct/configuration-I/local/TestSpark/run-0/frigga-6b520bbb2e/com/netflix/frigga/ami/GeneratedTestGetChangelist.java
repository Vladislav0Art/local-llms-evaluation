package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        // Arrange
        String expected = "changelist";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setChangelist("expected");

        System.out.println(parseName.getChangelist());
    }

}