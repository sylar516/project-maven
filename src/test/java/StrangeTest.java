import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

//Данный тест будет провален из-за конфигурации maven-surefire-plugin
public class StrangeTest {

    @Test
    public void shouldFail() {
        fail("By design");
    }
}