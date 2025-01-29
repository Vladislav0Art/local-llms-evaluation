package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestRectangle {

    @Test
    public void testRectangle() throws InterruptedException {
        for (int i = 0; i < 10000000; i++) {
            Rectangle rectangle = new Rectangle(10);
            Thread.sleep(10);
        }
    }

}