package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasic_SafelistCreatedReturnsBasic {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void basic_SafelistCreatedReturnsBasic() {
        Safelist safelist = Safelist.basic();
        Mockito.verify(safelist).basic();
    }

}