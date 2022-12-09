package org.example;

public class Division {
    /**
     * Сlass elements
     */
    private int ID;
    private String  title;

    /**
     * class constructor
     * @param new_title field value meaning name
     * field ID is randomly generated
     */
    public Division(String new_title){
        title=new_title;
        ID=(int)(Math.random() * 1000);
    }

    /**
     * change value function Id
     * @param newID new field ID type int
     */
    public void setID(int newID){
        this.ID=newID;
    }

    /**
     * change value function Id
     * @param newID new field ID type string
     */
    public void setID(String newID){
        this.ID=Integer.parseInt(newID);
    }

    /**
     * change value function name
     * @param newTitle new field Title
     */
    public void setTitle(String newTitle){
        this.title=newTitle;}

    /**
     * get value function Id
     * @return value ID
     */
    public int getID(){
        return this.ID;
    }

    /**
     * get value function name
     * @return value Title
     */
    public String getTitle(){
        return this.title;
    }
    public String getDiv(){
        return "ID=" + this.getID() +" DivName=" + this.getTitle();
    }
}