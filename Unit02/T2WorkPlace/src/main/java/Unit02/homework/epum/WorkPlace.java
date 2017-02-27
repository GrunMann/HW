package Unit02.homework.epum;

public class WorkPlace  {
    private String workToolsList="";
    private double workToolsCost=0;
    public void addToWorkplace(String toolName){
        WritingTool tool = new WritingTool(toolName);
        workToolsList+=tool.getName()+" ";
        workToolsCost+=tool.getPrice();
    }
    public void removeFromWorkplace(String toolName){
        if(workToolsList.contains(toolName)){
            WritingTool tool = new WritingTool(toolName);
            workToolsList=workToolsList.replaceFirst(toolName+" ","");
            workToolsCost-= tool.getPrice();
        }else{
            System.out.println("Wrong tool name \""+toolName+"\". Nothing deleted.");
        }
    }

    public String getWorkToolsList() {
        return workToolsList;
    }

    public double getWorkToolsCost() {
        return workToolsCost;
    }
}
