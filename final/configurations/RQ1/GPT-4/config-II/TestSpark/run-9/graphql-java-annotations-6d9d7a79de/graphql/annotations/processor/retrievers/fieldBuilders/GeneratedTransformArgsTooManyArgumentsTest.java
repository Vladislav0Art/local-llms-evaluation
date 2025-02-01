package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTransformArgsTooManyArgumentsTest {

    @Retention(RetentionPolicy.RUNTIME)
    @interface SampleAnnotation {
        String value() default "";
    }

    @SampleAnnotation(value = "testValue")
    class TestClass {
    }

    @SampleAnnotation
    class TestClassNoVal {
    }

    @Test
    public void transformArgsTooManyArgumentsTest() {
        TestClass testClass = new TestClass();

        try {
            Field field = TestClass.class.getDeclaredField("testClass");
            field.setAccessible(true);

            ProcessingElementsContainer mockedContainer = mock(ProcessingElementsContainer.class);
            when(mockedContainer.getDirectiveRegistry()).thenReturn(new GraphQLDirectiveContainer());

            DirectivesBuilder builder = new DirectivesBuilder(field, mockedContainer);
            GraphQLDirective testDirective = GraphQLDirective.newDirective().name("test").argument(GraphQLArgument.newArgument().name("arg").type(Scalars.GraphQLString).build()).build();

            builder.transformArgs(testDirective, new String[]{});
        } catch (NoSuchFieldException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}