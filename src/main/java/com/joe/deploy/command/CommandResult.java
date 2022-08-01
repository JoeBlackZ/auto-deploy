package com.joe.deploy.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JoeBlackZ
 * @description description
 * @date 2022/8/1 下午9:35
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CommandResult {

    private String stdin;
    private String[] stdinLines;
    private String stderr;
    private String[] stderrLines;
    private boolean ok;

}
