package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLEnumType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedBuildValidObjectTest {

    @Test
    public void buildValidObjectTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        when(object.getAnnotations()).thenReturn(Arrays.<Annotation>asList(new GraphQLDirectives() {
            public Class<? extends Annotation> annotationType() {
                return GraphQLDirectives.class;
            }

            public String[] value() {
                return new String[0];
            }
        }).toArray());

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        assertNotNull(directives);
        assertEquals(0, directives.length);
    }

}