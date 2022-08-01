package com.joe.deploy.command;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class CommandHelperTest {

    @Test
    void execute() throws IOException {
        CommandResult result = CommandHelper.execute("ls -lv");
        log.info(result.toString());
    }
}