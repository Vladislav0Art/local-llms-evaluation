package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckSpineItem_returns_true_when_spine_item_has_correct_role {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFChecker opfChecker;

    public void initHandler() {
        opfChecker.initHandler();
    }

    @Test
    public void checkSpineItem_returns_true_when_spine_item_has_correct_role() {
        OPFItem item = new OPFItem();
        item.setRole(Roles.FIRST);
        assertTrue(opfChecker.checkSpineItem(item, opfHandler));
    }

}