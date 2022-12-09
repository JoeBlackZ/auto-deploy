package com.joe.deploy.ansible.module;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhangqi
 */
@Data
@Builder
public class Shell {

    private String chdir;
    private String cmd;
    private String creates;
    private String executable;
    private String freeForm;
    private String removes;
    private String stdin;
    private boolean stdinAddNewline;

}
