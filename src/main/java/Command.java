/**
 * Represents the Command that is sent to the TaskList to handle the Tasks in TaskList.
 * A Command is represented by:
 * a String <code>command</code> which describes the type of command.
 * an int <code>index</code> which is used by DeleteCommand and DoneCommand.
 * a Task <code>task</code> which is used by DeadlineCommand, EventCommand,TodoCommand.
 */
public abstract class Command {
    protected String command;
    protected int index;
    protected Task task;

    public String getCommand() {
        return this.command;
    }
    public int getIndex() {
        return this.index;
    }

    public Task getTask() {
        return this.task;
    }


}
