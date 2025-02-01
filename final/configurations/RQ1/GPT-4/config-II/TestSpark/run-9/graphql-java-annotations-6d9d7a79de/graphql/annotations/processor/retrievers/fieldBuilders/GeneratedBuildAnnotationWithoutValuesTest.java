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

public class GeneratedBuildAnnotationWithoutValuesTest {

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
    public void buildAnnotationWithoutValuesTest() {
        TestClassNoVal testClass = new TestClassNoVal();

        try {
            Field field = TestClassNoVal.class.getDeclaredField("testClass");
            field.setAccessible(true);

            ProcessingElementsContainer mockedContainer = mock(ProcessingElementsContainer.class);
            when(mockedContainer.getDirectiveRegistry()).thenReturn(new GraphQLDirectiveContainer());

            DirectivesBuilder builder = new DirectivesBuilder(field, mockedContainer);
            GraphQLDirective[] result = builder.build();
            Assert.assertEquals(0, result.length);
        } catch (NoSuchFieldException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}