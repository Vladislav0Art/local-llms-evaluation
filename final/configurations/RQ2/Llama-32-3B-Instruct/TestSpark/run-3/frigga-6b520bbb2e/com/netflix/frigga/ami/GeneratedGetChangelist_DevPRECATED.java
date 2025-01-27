package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetChangelist_DevPRECATED {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void getChangelist_DevPRECATED() {
        String changelist = AppVersion.getChangelist();
        assertNull(changelist); // Test deprecated method and assert it's null
    }

}