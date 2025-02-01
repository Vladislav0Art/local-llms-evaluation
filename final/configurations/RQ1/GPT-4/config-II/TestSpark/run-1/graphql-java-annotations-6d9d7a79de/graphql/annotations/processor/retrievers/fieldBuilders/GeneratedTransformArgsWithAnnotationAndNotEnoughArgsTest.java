package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.Coercing;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Matchers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

public class GeneratedTransformArgsWithAnnotationAndNotEnoughArgsTest {

    @Test
    public void transformArgsWithAnnotationAndNotEnoughArgsTest() {
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[]{});
        when(directive.getArguments()).thenReturn(Arrays.asList(Mockito.mock(GraphQLArgument.class)));

        try {
            builder.transformArgs(directive, annotation);
            fail("Expected an GraphQLAnnotationsException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Directive '" + directive.getName() + "' is supplied with more argument values than it supports"));
        }
    }

}