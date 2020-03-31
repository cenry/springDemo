package com.andycen.spring.method.injection;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class CommandManager {

    public Object process(Object commandState) {
        // grab a new instance of the appropriate Command
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    @Lookup
    protected abstract Command createCommand();

}