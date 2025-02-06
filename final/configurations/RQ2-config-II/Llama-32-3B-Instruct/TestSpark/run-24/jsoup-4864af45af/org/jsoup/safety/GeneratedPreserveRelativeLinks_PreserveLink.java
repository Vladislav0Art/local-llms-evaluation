package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPreserveRelativeLinks_PreserveLink {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void preserveRelativeLinks_PreserveLink() {
        boolean preserve = true;
        Safelist safelist = Safelist.preserveRelativeLinks(preserve);
        Mockito.verify(safelist).preserveRelativeLinks(preserve);
    }

}