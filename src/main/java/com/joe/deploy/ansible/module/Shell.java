package com.joe.deploy.ansible.module;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhangqi
 */
@Data
@Builder
public class Shell {

    /**
     * Change into this directory before running the command.
     */
    private String chdir;

    /**
     * The command to run followed by optional arguments.
     */
    private String cmd;

    /**
     * A filename, when it already exists, this step will not be run.
     */
    private String creates;

    /**
     * Change the shell used to execute the command.
     * This expects an absolute path to the executable.
     */
    private String executable;

    /**
     * The shell module takes a free form command to run, as a string.
     * There is no actual parameter named ‘free form’.
     * See the examples on how to use this module.
     */
    private String freeForm;

    /**
     * A filename, when it does not exist, this step will not be run.
     */
    private String removes;

    /**
     * Set the stdin of the command directly to the specified value.
     */
    private String stdin;

    /**
     * Whether to append a newline to stdin data.
     * Choices:  false  true(default)
     */
    private boolean stdinAddNewline;

    @Override
    public String toString() {
        return "Shell{" +
                "chdir='" + chdir + '\'' +
                ", cmd='" + cmd + '\'' +
                ", creates='" + creates + '\'' +
                ", executable='" + executable + '\'' +
                ", freeForm='" + freeForm + '\'' +
                ", removes='" + removes + '\'' +
                ", stdin='" + stdin + '\'' +
                ", stdinAddNewline=" + stdinAddNewline +
                '}';
    }
}
