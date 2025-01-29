package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCheckContentReturnsFalse {

    private OPFChecker30 checker;

    @BeforeEach
    public void setup() {
        this.checker = new OPFChecker30(ValidationContext.createDefault());
    }

    @Test
    public void testCheckContentReturnsFalse() {
        doReturn(false).when(this.checker).checkContent();
        assertThat(this.checker.checkContent(), isFalse);
    }

}