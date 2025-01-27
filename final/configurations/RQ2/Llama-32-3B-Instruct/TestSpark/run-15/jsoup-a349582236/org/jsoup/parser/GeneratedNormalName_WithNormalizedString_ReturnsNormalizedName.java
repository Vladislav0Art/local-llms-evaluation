package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_WithNormalizedString_ReturnsNormalizedName {

    @Test
    public void normalName_WithNormalizedString_ReturnsNormalizedName() {
        when(Normalizer.normalize(anyString())).thenReturn("div");
        assertThat(Tag.valueOf("   ").normalName(), is("div"));
    }

}