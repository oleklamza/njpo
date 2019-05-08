package njpo;

abstract public class Command {

    protected TodoList todos;

    public Command(TodoList todos) {
        this.todos = todos;
    }

    abstract void execute();

    abstract void unexecute();
}
