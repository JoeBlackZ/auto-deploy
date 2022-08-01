package com.joe.deploy.command;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author JoeBlackZ
 * @description description
 * @date 2022/8/1 下午9:22
 */
public class CommandHelper {

    private CommandHelper() {
    }

    public static CommandResult execute(String commandLine) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(commandLine);
        CommandResult commandResult = new CommandResult();
        try (BufferedReader stdinReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
             BufferedReader stderrReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
            String[] stdinLines = readBufferedContent(stdinReader);
            String[] stderrLines = readBufferedContent(stderrReader);
            commandResult.setStdinLines(stdinLines);
            commandResult.setStdin(String.join(System.lineSeparator(), stdinLines));
            commandResult.setStderrLines(stderrLines);
            commandResult.setStderr(String.join(System.lineSeparator(), stderrLines));
        }
        return commandResult;
    }

    private static String[] readBufferedContent(BufferedReader bufferedReader) throws IOException {
        List<String> lines = new ArrayList<>();
        String line;
        while (Objects.nonNull(line = bufferedReader.readLine())) {
            lines.add(line);
        }
        return lines.toArray(new String[0]);
    }

}
