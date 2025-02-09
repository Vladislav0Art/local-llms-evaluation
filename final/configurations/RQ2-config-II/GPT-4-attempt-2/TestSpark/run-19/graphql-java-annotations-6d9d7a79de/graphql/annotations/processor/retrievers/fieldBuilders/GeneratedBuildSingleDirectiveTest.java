package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildSingleDirectiveTest {

    @Mock
    private Method annotatedElement;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildSingleDirectiveTest() {
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{new GraphQLDirectives() {

            @Override
            public Class<? extends Annotation> annotationType() {
                return GraphQLDirectives.class;
            }

            @Override
            public Directive[] value() {
                return new Directive[]{new Directive() {
                    @Override
                    public Class<? extends Annotation> annotationType() {
                        return Directive.class;
                    }

                    @Override
                    public String name() {
                        return "single";
                    }

                    @Override
                    public Argument[] arguments() {
                        return new Argument[0];
                    }
                }};
            }
        }});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] result = directivesBuilder.build();
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("single", result[0].getName());
    }

}