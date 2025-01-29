package com.netflix.frigga.ami;

import org.junit.Test;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        String[] changelist = {"file1.txt", "file2.txt"};
        AppVersion.changelist = changelist;
        assertEquals(changelist, AppVersion.getChangelist());
    }

}