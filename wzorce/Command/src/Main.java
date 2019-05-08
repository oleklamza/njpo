package njpo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Command cmd;

        TodoList list = new TodoList();

        List<Command> log = new ArrayList();

        log.add(new AddCommand(list, "foo"));
        log.add(new AddCommand(list, "bar"));
        log.add(new AddCommand(list, "baz"));

        for (Command c : log) {
            c.execute();
        }

        list.print();

        cmd = new AddCommand(list, "bzzzzz");
        cmd.execute();

        list.print();

        ((AddCommand) cmd).unexecute();

        list.print();


        cmd = new ClearCommand(list);
        cmd.execute();

        list.print();

        cmd.unexecute();

        list.print();

    }
}
