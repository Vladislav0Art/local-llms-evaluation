package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildOneDirectiveTest {

    @Mock
    private AnnotatedElement mockAnnotatedElement;

    @Mock
    private ProcessingElementsContainer mockContainer;

    @Test
    public void buildOneDirectiveTest() {
        when(mockAnnotatedElement.getAnnotations()).thenReturn(new Annotation[]{new GraphQLDirectives() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return GraphQLDirectives.class;
            }

            @Override
            public Class[] value() {
                return new Class[]{TestDirective.class};
            }
        }});

        DirectivesBuilder builder = new DirectivesBuilder(mockAnnotatedElement, mockContainer);
        GraphQLDirective[] result = builder.build();

        assertEquals(1, result.length);
        assertEquals("directive", result[0].getName());
    }

    @GraphQLDirective(name = "testDirective")
    static class TestDirective implements graphql.annotations.annotationTypes.directives.definition.GraphQLDirective {
        @Override
        public Class<? extends Annotation> annotationType() {
            return TestDirective.class;
        }

        @Override
        public String name() {
            return "directive";
        }
    }

}