package njpo;

public class AddCommand extends Command {

    private String todo;
    private int idx;

    public AddCommand(TodoList todos, String todo) {
        super(todos);

        this.todo = todo;
    }

    @Override
    void execute() {
        idx = todos.size();
        todos.add(todo);
    }

    void unexecute() {
        todos.remove(idx);
    }

}
