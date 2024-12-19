package graphql.annotations.processor.retrievers.fieldBuilders;

import com.github.javapoet.FieldBuilder;
import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestPublicStaticMethod {

    @Test
    public void testPublicStaticMethod() {
        public static int getSumOfAAndB () {
            return 1 + 2;
        }

        System.out.println(getSumOfAAndB());
    }

}