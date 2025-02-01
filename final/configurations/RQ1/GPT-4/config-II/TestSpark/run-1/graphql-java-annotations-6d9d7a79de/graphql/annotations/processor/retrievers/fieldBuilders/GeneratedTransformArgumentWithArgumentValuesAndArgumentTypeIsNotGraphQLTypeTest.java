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

public class GeneratedTransformArgumentWithArgumentValuesAndArgumentTypeIsNotGraphQLTypeTest {

    @Test
    public void transformArgumentWithArgumentValuesAndArgumentTypeIsNotGraphQLTypeTest() {
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        GraphQLDirective.Builder directiveBuilder = newDirective(Mockito.mock(GraphQLDirective.class));
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        when(argument.getType()).thenReturn(Object.class);
        String[] argumentValues = {"value1"};

        try {
            builder.transformArgument(argumentValues, directiveBuilder, Arrays.asList(argument), 0);
            fail("Expected an GraphQLAnnotationsException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Directive argument type must be a scalar!"));
        }
    }

}