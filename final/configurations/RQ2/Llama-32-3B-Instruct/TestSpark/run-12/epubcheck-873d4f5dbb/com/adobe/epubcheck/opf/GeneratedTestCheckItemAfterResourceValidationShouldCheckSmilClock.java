package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckItemAfterResourceValidationShouldCheckSmilClock {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void testCheckItemAfterResourceValidationShouldCheckSmilClock() {
        // given
        SmilClock smilClock = SmilClock.class;
        OPFItem item = new OPFItem();
        item.setResourceValidationResult(smilClock);

        // when
        new OPFChecker30(context).checkItemAfterResourceValidation(item.getResourceValidationResult());

        // then
        Mockito.verify(opfHandler).checkSpineItems();
    }

    public static class Metadata {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Roles {
        private Set<String> roles;

        public void setRoles(Set<String> roles) {
            this.roles = roles;
        }

        public Set<String> getRoles() {
            return roles;
        }
    }

}