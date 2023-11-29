package workshop;

public class Tool {

    String toolType;

    public Tool(String toolType) {
        this.toolType = toolType;
    }

    public void useTool() {
        System.out.println("typ narzedzia zbrodni: " + toolType);
    }

}