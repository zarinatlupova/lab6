package server;


import commands.Command;

import java.io.Serializable;

public class SerializedSimplyCommand implements Serializable {

    private Command command;

    public SerializedSimplyCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;}
}