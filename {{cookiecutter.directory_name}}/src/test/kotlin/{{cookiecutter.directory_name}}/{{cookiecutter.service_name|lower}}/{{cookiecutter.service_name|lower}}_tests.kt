package {{cookiecutter.directory_name}}

import {{cookiecutter.directory_name}}.{{cookiecutter.service_name|lower}}.*
import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun f() {
        assertEquals("test", {{cookiecutter.service_name}}().perform("test"))
    }
}