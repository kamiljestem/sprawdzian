package workshop;

import workshop.Tool;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    public void start() {
        Tool tool1 = new Tool("kula armatnia");
        tool1.useTool();

        Tool tool2 = new Tool("naboj 12,7 x 99mm NATO");

        List<Tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);

        for (Tool tool : tools) {
            System.out.println("Narzedzie zbrodni: " + tool.toolType);
        }
    }

}