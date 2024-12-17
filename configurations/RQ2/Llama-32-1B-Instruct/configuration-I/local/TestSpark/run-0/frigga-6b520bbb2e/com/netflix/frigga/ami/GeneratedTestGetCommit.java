package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        // Arrange
        String expected = "commit";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setCommit("expected");

        System.out.println(parseName.getCommit());
    }

}