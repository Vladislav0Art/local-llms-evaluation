package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemShouldCheckMetadataAndRoles {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void checkItemShouldCheckMetadataAndRoles() {
        // when
        when(item.getMetadataSet()).thenReturn(new Metadata());
        when(item.getRoles()).thenReturn(Roles.values());

        // then
        new OPFChecker30(context).checkItem(item, opfHandler);
    }

}