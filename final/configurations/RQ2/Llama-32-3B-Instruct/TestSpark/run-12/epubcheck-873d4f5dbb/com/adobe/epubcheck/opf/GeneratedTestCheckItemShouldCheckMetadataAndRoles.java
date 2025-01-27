package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckItemShouldCheckMetadataAndRoles {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void testCheckItemShouldCheckMetadataAndRoles() {
        // given
        Metadata metadata = new Metadata();
        Roles roles = new Roles();
        roles.setRoles(new String[]{"role1", "role2"});
        OPFItem item = new OPFItem();
        item.setMetadataSet(metadata);
        item.setRoles(roles);

        // when
        new OPFChecker30(context).checkItem(item, opfHandler);

        // then
        Mockito.verify(opfHandler).checkItem();
    }

}