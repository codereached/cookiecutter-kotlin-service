package {{cookiecutter.directory_name}}

import {{cookiecutter.directory_name}}.{{cookiecutter.service_name|lower}}.*

fun main(args: Array<String>) {
    println({{cookiecutter.service_name}}().perform("test"))
}