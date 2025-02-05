package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildWithMultipleDirectiveAnnotationsTest {

    @Test
    public void buildWithMultipleDirectiveAnnotationsTest() {
        Method mockMethod = Mockito.mock(Method.class);
        when(mockMethod.getAnnotations()).thenReturn(new Annotation[]{new ValidAnnotation(), new ValidAnnotation()});
        DirectivesBuilder builder = new DirectivesBuilder(mockMethod, null);
        GraphQLDirective[] result = builder.build();
        assertNotNull(result);
        assertEquals(2, result.length);
    }

}

class ValidAnnotation implements Annotation {

    @Override
    public Class<? extends Annotation> annotationType() {
        return GraphQLDirectives.class;
    }
}

class InvalidAnnotation implements Annotation {

    @Override
    public Class<? extends Annotation> annotationType() {
        return this.getClass();
    }

}