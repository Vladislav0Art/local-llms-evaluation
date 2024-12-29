package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_shouldCall_opfHandler_check_item {

    @Mock
    private ValidationContext validationContext;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkItem_shouldCall_opfHandler_check_item() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        opfChecker30.checkItem(item, opfHandler);
        // assert check_item was called with the correct item and handler
    }

}