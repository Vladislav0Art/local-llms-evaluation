package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCheckItemReturnsFalseWhenUriIsInvalid {

    private OPFChecker30 checker;

    @BeforeEach
    public void setup() {
        this.checker = new OPFChecker30(ValidationContext.createDefault());
    }

    @Test
    public void testCheckItemReturnsFalseWhenUriIsInvalid() {
        when(item.getUri()).thenReturn("invalid_url");
        doReturn(false).when(opfHandler).handleResource();
        OpfItem item = new OPFItem();
        checker.checkItem(item, opfHandler);
        assertThat(item.isUriValid(), isFalse);
    }

}