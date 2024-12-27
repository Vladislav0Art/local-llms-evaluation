package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        File file = new File("file.txt");
        Charset charset = Charset.forName("UTF-8");
        WordWrap.Builder builder = WordWrap.from(file, charset);
        Mockito.verify(builder).setText(new String(Mockito.any(byte[].class), charset));
    }

}