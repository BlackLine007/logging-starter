package ru.aykozhaevnm.loggingstarter;

public class LoggingStarterAutoConfiguration {

    public static void println(String input) {
        System.out.println("Вызвано из gradle библиотеки: " + input);
    }
}
