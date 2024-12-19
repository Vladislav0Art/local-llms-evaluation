package graphql.annotations.processor.retrievers.fieldBuilders;

import com.github.javapoet.FieldBuilder;
import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        public static int addNumbers ( int a, int b){
            return a + b;
        }

        System.out.println(addNumbers(1, 2));
    }

}